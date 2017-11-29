.class public Lcom/snow/alldalvikopcode/MainActivity;
.super Landroid/app/Activity;
.source "MainActivity.java"


# static fields
.field public static final TAG:Ljava/lang/String; = "snow_testjiagu"
.field private static sbooleanfield:Z

.field private static sbytefield:B

.field private static scharfield:C

.field private static sdoublefield:D

.field private static sintfield:I

.field private static sobjectfield:Ljava/lang/String;

.field private static sshortfield:S


# instance fields
.field private booleanfield:Z

.field private btn:Landroid/widget/Button;

.field private bytefield:B

.field private charfield:C

.field private doublefield:D

.field private intfield:I

.field private objectfield:Ljava/lang/String;

.field private shortfield:S

.field private tv2:Landroid/widget/TextView;

 #direct methods
.method static constructor <clinit>()V
    .locals 3
    .prologue
    const/4 v2, 0x1
    sput v2, Lcom/snow/alldalvikopcode/MainActivity;->sintfield:I
    
    const-wide/high16 v0, 0x4000000000000000L    # 2.0
    sput-wide v0, Lcom/snow/alldalvikopcode/MainActivity;->sdoublefield:D
    
    const-string v0, "snow"
    sput-object v0, Lcom/snow/alldalvikopcode/MainActivity;->sobjectfield:Ljava/lang/String;
    
    sput-boolean v2, Lcom/snow/alldalvikopcode/MainActivity;->sbooleanfield:Z
    
    const/4 v0, 0x3
    sput-byte v0, Lcom/snow/alldalvikopcode/MainActivity;->sbytefield:B
    
    const/16 v0, 0x73
    sput-char v0, Lcom/snow/alldalvikopcode/MainActivity;->scharfield:C
    
    const/4 v0, 0x4
    sput-short v0, Lcom/snow/alldalvikopcode/MainActivity;->sshortfield:S
    
    return-void
.end method
# direct methods
.method public constructor <init>()V
        .locals 3

    .prologue
    const/4 v2, 0x1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V


    iput v2, p0, Lcom/snow/alldalvikopcode/MainActivity;->intfield:I


    const-wide/high16 v0, 0x4000000000000000L    # 2.0
    iput-wide v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->doublefield:D


    const-string v0, "snow"
    iput-object v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->objectfield:Ljava/lang/String;


    iput-boolean v2, p0, Lcom/snow/alldalvikopcode/MainActivity;->booleanfield:Z
    
    const/4 v0, 0x3
    iput-byte v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->bytefield:B

    const/16 v0, 0x73
    iput-char v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->charfield:C

    const/4 v0, 0x4
    iput-short v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->shortfield:S

    return-void
.end method

.method private directfunc(I)I
    .locals 2
    .param p1, "a1"    # I

    .prologue
    .line 92
    const-string v0, "snow_testjiagu"

    const-string v1, "----invoke-direct---"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 93
    add-int/lit8 v0, p1, 0x1

    return v0
.end method

.method private directrangefunc(IIIII)I
    .locals 2
    .param p1, "a1"    # I
    .param p2, "a2"    # I
    .param p3, "a3"    # I
    .param p4, "a4"    # I
    .param p5, "a5"    # I

    .prologue
    .line 150
    const-string v0, "snow_testjiagu"

    const-string v1, "----invoke-direct/range---"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 151
    add-int v0, p1, p2

    add-int/2addr v0, p3

    add-int/2addr v0, p4

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static staticfunc(I)I
    .locals 2
    .param p0, "a1"    # I

    .prologue
    .line 87
    const-string v0, "snow_testjiagu"

    const-string v1, "----invoke-static---"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    add-int/lit8 v0, p0, 0x1

    return v0
.end method

.method public static staticrangefunc(IIIIII)I
    .locals 2
    .param p0, "a1"    # I
    .param p1, "a2"    # I
    .param p2, "a3"    # I
    .param p3, "a4"    # I
    .param p4, "a5"    # I
    .param p5, "a6"    # I

    .prologue
    .line 200
    const-string v0, "snow_testjiagu"

    const-string v1, "----invoke-static/range---"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 201
    add-int v0, p0, p1

    add-int/2addr v0, p2

    add-int/2addr v0, p3

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private moveresultfunc()I
    .locals 1

    .prologue
    .line 121
    const/4 v0, 0x5

    return v0
.end method

.method private moveresultobjectfunc()Landroid/content/Context;
    .locals 0

    .prologue
    .line 127
    return-object p0
.end method

.method private moveresultwidefunc()D
    .locals 2

    .prologue
    .line 124
    const-wide/high16 v0, 0x4014000000000000L    # 5.0

    return-wide v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
#注意累计指令机器码字节数是1160
#累计dalvik指令编码是0x00-0xff总256条,我累计实现209条指令，其中9条指令未实现，26条指令是dalvik没有使用的，12条指令只存在于odex文件中
    .locals 14
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    
    #一、空操作指令1条 手工植入====================================================
    nop													#opcode=0x00
	
    #四、数据定义指令 10条 ，手工植入，有一条不会写====================================================
	const/4 			v0,0x7							#opcode=0x12	#存入int 8到v0
	const/16 			v1,0x5							#opcode=0x13	#存入int 3到v1
	const				v2,0x3  						#opcode=0x14	#存入int 3到v2
	const/high16 		v3,0x41200000    				#opcode=0x15	#存入float 10.0f到v3
	const-wide/16 		v3,0x03e8						#opcode=0x16	
	const-wide/32 		v3,0x00bc614e					#opcode=0x17	#存入long 12345678到v3,v4
	const-wide 			v3,0x002bdc545d6b4b87L			#opcode=0x18	#存入long 12345678901234567到v3,v4
	const-wide/high16 	v3,0x4024000000000000L			#opcode=0x19	#存入long 10.0常量到v3,v4
	const-string		v5, "snow_test"					#opcode=0x1A
	const-class         v6, Landroid/content/Context;   #opcode=0x1C
    
    
   	#二、数据操作指令13条,植入====================================================
	move 				v6, v0			#opcode=0x01 v0移动到v6
	move/from16 		v6, v0			#opcode=0x02 v0移动到v6
	move/16 			v6, v0			#opcode=0x03 v0移动到v6
	move-wide 			v7, v3			#opcode=0x04 v3,v4移动到v7,v8是移动long/double值
	move-wide/from16 	v7, v3			#opcode=0x05 v3,v4移动到v7,v8是移动long/double值
	move-wide/16		v7, v3			#opcode=0x06 v3,v4移动到v7,v8是移动long/double值
    move-object		    v9,	p0			#opcode=0x07，p0的对象引用移动到v9
	move-object/from16	v9,	p0			#opcode=0x08，p0的对象引用移动到v9
	move-object/16		v9,	p0			#opcode=0x09，p0的对象引用移动到v9
    
   
    #下面去增加，方法调用指令后面增加 
    invoke-direct {p0}, Lcom/snow/alldalvikopcode/MainActivity;->moveresultfunc()I
	move-result 		v6				#opcode=0x0a,移动上一个方法调用的返回值到
    
    invoke-direct {p0}, Lcom/snow/alldalvikopcode/MainActivity;->moveresultwidefunc()D
	move-result-wide 	v7				#opcode=0x0b,移动上一个方法调用的返回值到

    invoke-direct {p0}, Lcom/snow/alldalvikopcode/MainActivity;->moveresultobjectfunc()Landroid/content/Context;
	move-result-object  v9				#opcode=0x0c,移动上一个方法调用的返回值到
    
    #move-exception     v7               #opcode=0xD 蛋疼1，注意这不是try catch生成的，不知道怎么实现
	
    

	
   	#五.锁指令2条，植入===================================================================
	monitor-enter          p0		#opcode=0x1d
	monitor-exit           p0		#opcode=0x1e
    #六.实例操作指令3条，植入=============================================================
   	check-cast             p1, Landroid/os/Bundle;				#opcode=0x1f 
	instance-of            v0, p1, Landroid/os/Bundle;			#opcode=0x20
    new-instance           v10, Ljava/lang/StringBuilder;		#opcode=0x22 新建字符串变量
    #七.数组操作指令18条,植入=============================================================
	const/4                v2, 0x4		        #用来作为数组大小
    const/4                v1, 0x2		        #用来做索引
    #int数组
	new-array              v0, v2, [I			#opcode=0x23,新建v2大小数组int []，引用丢v0里面
	array-length           v3, v0				#opcode=0x21,获取数组长度，长度丢v1里面
	fill-array-data	       v0, :array_0	        #opcode=0x26 初始化v0数组 
    aget	               v3,v0,v1				#opcode=0x44,从int数组v0，用v1做索引得到的值丢v2
    aput 	               v3,v0,v1				#opcode=0x4B,把v2丢到int数组v0，用v1做索引里面
    
    #long数组 
    new-array               v0, v2, [J			#创建long数组
    fill-array-data         v0, :array_1 
    aget-wide               v3,v0,v1			#opcode=0x45,获取值存入v2,v3里面，用v1做索引
    aput-wide               v3,v0,v1			#opcode=0x4C,把v2 v3的值存入,v1作为索引里面    
    
    #byte数组
    new-array              v0, v2, [B
    fill-array-data        v0, :array_2
    aget-byte              v3,v0,v1             #opcode=0x48
    aput-byte              v3,v0,v1             #opcode=0x4F
    
    #char数组
    new-array               v0, v2, [C
    fill-array-data         v0, :array_3
    aget-char               v3,v0,v1            #opcode=0x49
    aput-char               v3,v0,v1            #opcode=0x50
    
    #short数组
    new-array               v0, v2, [S
    fill-array-data         v0, :array_4
    aget-short              v3,v0,v1            #opcode=0x4A
    aput-short              v3,v0,v1            #opcode=0x51
    
    
    const/4                 v1, 0x0         #用来做索引
    const/4                 v2, 0x1         #用来做数组大小
    #对象数组
    new-array               v0, v2, [Ljava/lang/String;          #创建String对象
    const-string            v3, "s"
    aput-object             v3,v0,v1      		#opcode=0x4D
    aget-object             v4,v0,v1      		#opcode=0x46
             
    #boolean数组
    new-array              v0, v2, [Z
    const/4                v3, 0x1
    aput-boolean           v3, v0, v1       	#opcode=0x4E
    aget-boolean           v3, v0, v1      	 	#opcode=0x47
    
    const/4                v0,0x3  #数组大小是3
    const/4                v2,0x1
    const/4                v3,0x2
    const/4                v4,0x3
	filled-new-array{v2,v3,v4},[I 			    #opcode=0x24    
	filled-new-array/range{v2 .. v4},[I			#opcode=0x25
    
    
    
    #八.异常指令1条,植入=============================================================
    #throw vAA opcode=0x27  蛋疼2，注意这不是try catch生成的，不知道怎么实现
    #九.跳转指令 17条,植入=============================================================
    #第一类跳转
	const/4 v1, 0x4
	goto 		:gotogoto_0				#opcode=0x28
	
	:gotogoto_0
	goto/16		:gotogoto_1				#opcode=0x29
	
	:gotogoto_1
	goto/32 	:gotogoto_2 			#opcode=0x2A
	
	:gotogoto_2
	#第二类跳转
	const/4 v0, 0x1
	packed-switch 			v0, :pswitch_data_0		#opcode=0x2B,switch形式1
	goto :gotogoto_3
		
	:pswitch_0
	const/4 v1, 0x1
	goto :gotogoto_3

	:pswitch_1
	const/4 v1, 0x2
	goto :gotogoto_3
	
	:gotogoto_3
	const/4 v0, 0x1
	sparse-switch 			v0, :sswitch_data_0		#opcode=0x2C,switch形式2
	goto :gotogoto_6
	
	:sswitch_0
	const/4 v1, 0x1
	goto :gotogoto_6

	:sswitch_1
	const/4 v1, 0x2
	goto :gotogoto_6
	
	:gotogoto_6
    
	#第三类跳转
	const/4 v0, 0x4
    const/4 v1, 0x5
    
    if-eq       v0,v1,:cond_0	     #opcode=0x32  v0==v1
    :cond_0
    
    if-ne       v0,v1,:cond_1	     #opcode=0x33  v0!=v1
    :cond_1
    
    if-lt       v0,v1,:cond_2	     #opcode=0x34  v0<v1
    :cond_2
    
    if-ge       v0,v1,:cond_3	     #opcode=0x35  v0>=v1
    :cond_3   
    
    if-gt       v0,v1,:cond_4	     #opcode=0x36  v0>v1
    :cond_4 
     
    if-le       v0,v1,:cond_5	     #opcode=0x37  v0<=v1
    :cond_5  
     
    
    if-eqz       v0,:cond_7	        #opcode=0x38  v0==0
    :cond_7
    
    if-nez       v0,:cond_8	        #opcode=0x39  v0!=0
    :cond_8
    
    if-ltz       v0,:cond_9	        #opcode=0x3A  v0<0
    :cond_9
    
    if-gez       v0,:cond_10	     #opcode=0x3b  v0>=0
    :cond_10   
    
    if-gtz       v0,:cond_11	     #opcode=0x3c  v0>0
    :cond_11 
     
    if-lez       v0,:cond_12	     #opcode=0x3d  v0<=0
    :cond_12  
    
    #十.比较指令 5条 ,植入=============================================================
   	const/high16 v1, 0x41300000                  # 11.0f  float 
    const/high16 v2, 0x41300000                  # 11.0f  float
          
    const-wide/high16 v3, 0x4026000000000000L    # 11.0   double，会存入v3和v4
    const-wide/high16 v5, 0x4026000000000000L    # 11.0   double，会存入v5和v6
    
    const-wide/16 v7, 0xb                        # 11      long,会存入v7和v8
    const-wide/16 v9, 0xb                        # 11      long,会存入v9和v10
     
     
    cmpl-float          v0,v1,v2                    #opcode=0x2D    比较v1和v2存入v0
    cmpg-float          v0,v1,v2                    #opcode=0x2E    比较v1和v2存入v0
    cmpl-double         v0,v3,v5                    #opcode=0x2F
    cmpg-double         v0,v3,v5                    #opcode=0x30
    cmp-long            v0,v7,v9                    #opcode=0x31
    
    #十一.字段操作指令,34条指令,植入=============================================================
    iget v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->intfield:I                              #opcode=0x52
    iput v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->intfield:I                              #opcode=0x59
    
    iget-wide v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->doublefield:D                      #opcode=0x53
    iput-wide v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->doublefield:D                      #opcode=0x5A
    
    iget-object v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->objectfield:Ljava/lang/String;   #opcode=0x54
    iput-object v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->objectfield:Ljava/lang/String;   #opcode=0x5B
    
    iget-boolean v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->booleanfield:Z                  #opcode=0x55
    iput-boolean v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->booleanfield:Z                  #opcode=0x5C
    
    iget-byte v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->bytefield:B                        #opcode=0x56
    iput-byte v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->bytefield:B                        #opcode=0x5D
    
    iget-char v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->charfield:C                        #opcode=0x57
    iput-char v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->charfield:C                        #opcode=0x5E
    
    iget-short v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->shortfield:S                      #opcode=0x58
    iput-short v0, p0, Lcom/snow/alldalvikopcode/MainActivity;->shortfield:S                      #opcode=0x5F
    
    
    
    sget v0, Lcom/snow/alldalvikopcode/MainActivity;->sintfield:I                                 #opcode=0x60
    sput v0, Lcom/snow/alldalvikopcode/MainActivity;->sintfield:I                                 #opcode=0x67
    
    sget-wide v0, Lcom/snow/alldalvikopcode/MainActivity;->sdoublefield:D                         #opcode=0x61
    sput-wide v0, Lcom/snow/alldalvikopcode/MainActivity;->sdoublefield:D                         #opcode=0x68
    
    sget-object v0, Lcom/snow/alldalvikopcode/MainActivity;->sobjectfield:Ljava/lang/String;      #opcode=0x62
    sput-object v0, Lcom/snow/alldalvikopcode/MainActivity;->sobjectfield:Ljava/lang/String;      #opcode=0x69
    
    sget-boolean v0, Lcom/snow/alldalvikopcode/MainActivity;->sbooleanfield:Z                     #opcode=0x63
    sput-boolean v0, Lcom/snow/alldalvikopcode/MainActivity;->sbooleanfield:Z                     #opcode=0x6A
    
    sget-byte v0, Lcom/snow/alldalvikopcode/MainActivity;->sbytefield:B                           #opcode=0x64
    sput-byte v0, Lcom/snow/alldalvikopcode/MainActivity;->sbytefield:B                           #opcode=0x6B
    
    sget-char v0, Lcom/snow/alldalvikopcode/MainActivity;->scharfield:C                           #opcode=0x65
    sput-char v0, Lcom/snow/alldalvikopcode/MainActivity;->scharfield:C                           #opcode=0x6C
    
    sget-short v0, Lcom/snow/alldalvikopcode/MainActivity;->sshortfield:S                         #opcode=0x66
    sput-short v0, Lcom/snow/alldalvikopcode/MainActivity;->sshortfield:S                         #opcode=0x6D
    #十二.方法调用指令,15条指令,其中odex用5条，有效的只有10条，2条无法写=========================================================
    const/4 v1, 0x1
    const/4 v2, 0x2
    const/4 v3, 0x3
    const/4 v4, 0x4
    const/16 v5, 0x37
    
    invoke-virtual {p0, v1}, Lcom/snow/alldalvikopcode/MainActivity;->virtualfunc(I)I        #invoke-virtual,opcode=6E
    #invoke-super,opcode=6F  见编译自带生成的
    invoke-direct {p0, v1}, Lcom/snow/alldalvikopcode/MainActivity;->directfunc(I)I          #invoke-direct,opcode=70
    invoke-static {v1}, Lcom/snow/alldalvikopcode/MainActivity;->staticfunc(I)I              #invoke-static,opcode=71
    
    const-string v0, "SNOW"
    const/4 v7, 0x0
    invoke-virtual {p0, v0, v7}, Lcom/snow/alldalvikopcode/MainActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    move-result-object v6
    const-string v0, "test"
    const-string v7, ""
    invoke-interface {v6, v0, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;   #invoke-interface,opcode=72
   
    move-object v0, p0
    invoke-virtual/range {v0 .. v5}, Lcom/snow/alldalvikopcode/MainActivity;->virtualrangefunc(IIIII)I      #invoke-virtual/range,opcode=74
    
    #蛋疼3 invoke-super/range,opcode=75 ,无法写不能再oncreate里面调用其父类Activity含有多个参数的方法
    
    move-object v0, p0
    invoke-direct/range {v0 .. v5}, Lcom/snow/alldalvikopcode/MainActivity;->directrangefunc(IIIII)I        #invoke-direct/range,opcode=76 
    
	const/4 v6, 0x2
    invoke-static/range {v1 .. v6}, Lcom/snow/alldalvikopcode/MainActivity;->staticrangefunc(IIIIII)I        #invoke-static/range,opcode=77
    
    #蛋疼4,invoke-interface-range,opcode=78,无法写，可以自定义接口，但是MainActivity就必须implements接口了
       
       
                    
    #十三.数据转换指令 21条=================================================================================
    #inta=v0
    #longa=v1,v2
    #floata=v3
    #doublea=v5,v6
    #intb=v7
    #longb=v8,v9
    #floatb=v10
    #doubleb=v11,v12
	const/4 			v0, 0x5
	const-wide/16		v1, 0x6
	const/high16		v3, 0x40e00000    # 7.0f
	const-wide/high16	v5, 0x4020000000000000L    # 8.0
	
    neg-int				v7, v0		    #neg-int vx, vy        opcode=7B
    not-int				v7, v0		    #not-int vx, vy        opcode=7C
    neg-long 			v8, v5		    #neg-long vx, vy       opcode=7D 	
    not-long 			v8, v5		    #not-long vx, vy       opcode=7E

    neg-float			v10, v3			#neg-float vx, vy      opcode=7F
    neg-double			v11, v5			#neg-double vx, vy     opcode=80

    
	int-to-long 		v8, v0		    #int-to-long vx, vy    		 opcode=81
    int-to-float 		v10, v0			#int-to-float vx, vy         opcode=82  
    int-to-double 		v11, v0			#int-to-double vx, vy        opcode=83 

    long-to-int 		v7, v1		    #long-to-int vx, vy          opcode=84
    long-to-float 		v9, v1			#long-to-float vx, vy        opcode=85
    long-to-double 		v11,v1			#long-to-double vx, vy       opcode=86

    float-to-int 		v7, v3			#float-to-int vx, vy         opcode=87
    float-to-long 		v8, v3			#float-to-long vx, vy        opcode=88
    float-to-double 	v11, v3			#float-to-double vx, vy      opcode=89

    double-to-int 		v7, v5			#double-to-int vx, vy        opcode=8A
    double-to-long 		v8, v5			#double-to-long vx, vy       opcode=8B
    double-to-float 	v9, v5			#double-to-float vx, vy      opcode=8C
    
    int-to-byte 		v1, v0			#int-to-byte vx, vy          opcode=8D
    int-to-char 		v1, v0			#int-to-char vx, vy          opcode=8E
    int-to-short 		v1, v0			#int-to-short vx, vy         opcode=8F
    #十四.数据运算指令 83条=================================================================================   
  	const/4 			v2, 0x5
   	const/4 			v4, 0x5
    add-int v0, v2, v4		#opcode=0x90	add-int v0, v2, v4	计算v2 + v4并将结果存入v0。
    sub-int v0, v2, v4		#opcode=0x91	sub-int v0, v2, v4	计算v2 - v4并将结果存入v0。
    mul-int v0, v2, v4		#opcode=0x92	mul-int v0, v2, v4	计算v2 * v4并将结果存入v0。
    div-int v0, v2, v4		#opcode=0x93	div-int v0, v2, v4	计算v2 / v4并将结果存入v0。
    rem-int v0, v2, v4		#opcode=0x94	rem-int v0, v2, v4	计算v2 % v4并将结果存入v0。
    and-int v0, v2, v4		#opcode=0x95	and-int v0, v2, v4	计算v2 与 v4并将结果存入v0。
    or-int  v0, v2, v4		#opcode=0x96	or-int v0, v2, v4	计算v2 或 v4并将结果存入v0。
    xor-int v0, v2, v4		#opcode=0x97	xor-int v0, v2, v4	计算v2 异或 v4并将结果存入v0。
    shl-int v0, v2, v4		#opcode=0x98	shl-int v0, v2, v4	左移v2，v4指定移动的位置，结果存入v0。
    shr-int v0, v2, v4		#opcode=0x99	shr-int v0, v2, v4	右移v2，v4指定移动的位置，结果存入v0。
    ushr-int v0, v2, v4		#opcode=0x9A	ushr-int v0, v2, v4	无符号右移v2，v4指定移动的位置，结果存入v0。
    
    const-wide/16		v2, 0x6
    const-wide/16		v4, 0x6
    add-long v0, v2, v4		#opcode=0x9B	add-long v0, v2, v4	计算v2,v2+1 + v4,v4+1并将结果存入v0,v0+1注1。
    sub-long v0, v2, v4		#opcode=0x9C	sub-long v0, v2, v4	计算v2,v2+1 - v4,v4+1并将结果存入v0,v0+1注1。
    mul-long v0, v2, v4		#opcode=0x9D	mul-long v0, v2, v4	计算v2,v2+1 * v4,v4+1并将结果存入v0,v0+1注1。
    div-long v0, v2, v4		#opcode=0x9E	div-long v0, v2, v4	计算v2,v2+1 / v4,v4+1并将结果存入v0,v0+1注1。
    rem-long v0, v2, v4		#opcode=0x9F	rem-long v0, v2, v4	计算v2,v2+1 % v4,v4+1并将结果存入v0,v0+1注1。
    and-long v0, v2, v4		#opcode=0xA0	and-long v0, v2, v4	计算v2,v2+1 与 v4,v4+1并将结果存入v0,v0+1注1。
    or-long v0, v2, v4		#opcode=0xA1	or-long v0, v2, v4	计算v2,v2+1 或 v4,v4+1并将结果存入v0,v0+1注1。
    xor-long v0, v2, v4		#opcode=0xA2	xor-long v0, v2, v4	计算v2,v2+1 异或 v4,v4+1并将结果存入v0,v0+1注1
    
    const/4 			     v4, 0x5   #这个一定要不然下面会崩溃
    shl-long v0, v2, v4		#opcode=0xA3	shl-long v0, v2, v4	左移v2,v2+1，v4指定移动的位置，结果存入v0,v0+1注1。
    shr-long v0, v2, v4		#opcode=0xA4	shr-long v0, v2, v4	右移v2,v2+1，v4指定移动的位置，结果存入v0,v0+1注1。
    ushr-long v0, v2, v4	#opcode=0xA5	ushr-long v0, v2, v4	无符号右移v2,v2+1，v4指定移动的位置，结果存入v0,v0+1注1。  
    
    const/high16	v2, 0x40e00000    # 7.0f
    const/high16	v4, 0x40e00000    # 7.0f 
    add-float v0, v2, v4	#opcode=0xA6	add-float v0, v2, v4	计算v2 + v4并将结果存入v0。
    sub-float v0, v2, v4	#opcode=0xA7	sub-float v0, v2, v4	计算v2 - v4并将结果存入v0。 
    mul-float v0, v2, v4	#opcode=0xA8	mul-float v0, v2, v4	计算v2 * v4并将结果存入v0。
    div-float v0, v2, v4	#opcode=0xA9	div-float v0, v2, v4	计算v2 / v4并将结果存入v0。
    rem-float v0, v2, v4	#opcode=0xAA	rem-float v0, v2, v4	计算v2 % v4并将结果存入v0。

    const-wide/high16	v2, 0x4020000000000000L    # 8.0
    const-wide/high16	v4, 0x4020000000000000L    # 8.0
    add-double v0, v2, v4	#opcode=0xAB	add-double v0, v2, v4	计算v2,v2+1 + v4,v4+1并将结果存入v0,v0+1注1。
    sub-double v0, v2, v4	#opcode=0xAC	sub-double v0, v2, v4	计算v2,v2+1 - v4,v4+1并将结果存入v0,v0+1注1。
	mul-double v0, v2, v4	#opcode=0xAD	#后来才知道现在补上
    div-double v0, v2, v4	#opcode=0xAE	div-double v0, v2, v4	计算v2,v2+1 / v4,v4+1并将结果存入v0,v0+1注1。
    rem-double v0, v2, v4	#opcode=0xAF	rem-double v0, v2, v4	计算v2,v2+1 % v4,v4+1并将结果存入v0,v0+1注1。
	#---------------------------------------------------------  
   	const/4 			v0, 0x5
   	const/4 			v2, 0x5
    add-int/2addr v0, v2	#opcode=0xB0	add-int/2addr v0, v2	计算v0 + v2并将结果存入v0。
    sub-int/2addr v0, v2	#opcode=0xB1	sub-int/2addr v0, v2	计算v0 - v2并将结果存入v0。
    mul-int/2addr v0, v2	#opcode=0xB2	mul-int/2addr v0, v2	计算v0 * v2并将结果存入v0。
    div-int/2addr v0, v2	#opcode=0xB3	div-int/2addr v0, v2	计算v0 / v2并将结果存入v0。
    rem-int/2addr v0, v2	#opcode=0xB4	rem-int/2addr v0, v2	计算v0 % v2并将结果存入v0。
    and-int/2addr v0, v2	#opcode=0xB5	and-int/2addr v0, v2	计算v0 与 v2并将结果存入v0。
    or-int/2addr v0, v2		#opcode=0xB6	or-int/2addr v0, v2	计算v0 或 v2并将结果存入v0。
    xor-int/2addr v0, v2	#opcode=0xB7	xor-int/2addr v0, v2	计算v0 异或 v2并将结果存入v0。
    shl-int/2addr v0, v2	#opcode=0xB8	shl-int/2addr v0, v2	左移v0，v2指定移动的位置，并将结果存入v0。
    shr-int/2addr v0, v2	#opcode=0xB9	shr-int/2addr v0, v2	右移v0，v2指定移动的位置，并将结果存入v0。
    ushr-int/2addr v0, v2	#opcode=0xBA	ushr-int/2addr v0, v2	无符号右移v0，v2指定移动的位置，并将结果存入v0。    
    
    const-wide/16		v0, 0x6
    const-wide/16		v2, 0x6
    add-long/2addr v0, v2	#opcode=0xBB	add-long/2addr v0, v2	计算v0,v0+1 + v2,v2+1并将结果存入v0,v0+1注1。
    sub-long/2addr v0, v2	#opcode=0xBC	sub-long/2addr v0, v2	计算v0,v0+1 - v2,v2+1并将结果存入v0,v0+1注1。
    mul-long/2addr v0, v2	#opcode=0xBD	mul-long/2addr v0, v2	计算v0,v0+1 * v2,v2+1并将结果存入v0,v0+1注1。
    div-long/2addr v0, v2	#opcode=0xBE	div-long/2addr v0, v2	计算v0,v0+1 / v2,v2+1并将结果存入v0,v0+1注1。
    rem-long/2addr v0, v2	#opcode=0xBF	rem-long/2addr v0, v2	计算v0,v0+1 % v2,v2+1并将结果存入v0,v0+1注1。
    and-long/2addr v0, v2	#opcode=0xC0	and-long/2addr v0, v2	计算v0,v0+1 与 v2,v2+1并将结果存入v0,v0+1注1。
    or-long/2addr  v0, v2	#opcode=0xC1	or-long/2addr v0, v2	计算v0,v0+1 或 v2,v2+1并将结果存入v0,v0+1注1。
    xor-long/2addr v0, v2	#opcode=0xC2	xor-long/2addr v0, v2	计算v0,v0+1 异或 v2,v2+1并将结果存入v0,v0+1注1。
    const/4 			v2, 0x5
    shl-long/2addr v0, v2	#opcode=0xC3	shl-long/2addr v0, v2	左移v0,v0+1，v2指定移动的位置，并将结果存入v0,v0+1。
    shr-long/2addr v0, v2	#opcode=0xC4	shr-long/2addr v0, v2	右移v0,v0+1，v2指定移动的位置，并将结果存入v0,v0+1。
    ushr-long/2addr v0, v2	#opcode=0xC5	ushr-long/2addr v0, v2	无符号右移v0,v0+1，v2指定移动的位置，并将结果存入v0,v0+1。

    const/high16	v0, 0x40e00000    # 7.0f
    const/high16	v2, 0x40e00000    # 7.0f 
    add-float/2addr v0, v2	#opcode=0xC6	add-float/2addr v0, v2	计算v0 + v2并将结果存入v0。
    sub-float/2addr v0, v2	#opcode=0xC7	sub-float/2addr v0, v2	计算v0 - v2并将结果存入v0。
    mul-float/2addr v0, v2	#opcode=0xC8	mul-float/2addr v0, v2	计算v0 * v2并将结果存入v0。
    div-float/2addr v0, v2	#opcode=0xC9	div-float/2addr v0, v2	计算v0 / v2并将结果存入v0。
    rem-float/2addr v0, v2	#opcode=0xCA	rem-float/2addr v0, v2	计算v0 % v2并将结果存入v0。

    const-wide/high16	v0, 0x4020000000000000L    # 8.0
    const-wide/high16	v2, 0x4020000000000000L    # 8.0
    add-double/2addr v0, v2	#opcode=0xCB	add-double/2addr v0, v2	计算v0,v0+1 + v2,v2+1并将结果存入v0,v0+1注1。
    sub-double/2addr v0, v2	#opcode=0xCC	sub-double/2addr v0, v2	计算v0,v0+1 - v2,v2+1并将结果存入v0,v0+1注1。
    mul-double/2addr v0, v2	#opcode=0xCD	mul-double/2addr v0, v2	计算v0,v0+1 * v2,v2+1并将结果存入v0,v0+1注1。
    div-double/2addr v0, v2	#opcode=0xCE	div-double/2addr v0, v2	计算v0,v0+1 / v2,v2+1并将结果存入v0,v0+1注1。
    rem-double/2addr v0, v2	#opcode=0xCF	rem-double/2addr v0, v2	计算v0,v0+1 % v2,v2+1并将结果存入v0,v0+1注1。
	#---------------------------------------------------------    
   	const/4 			v0, 0x5
   	const/4 			v2, 0x6
    add-int/lit16 v0, v2, 0x1  	#opcode=0xD0	add-int/lit16 v0, v2, lit16	计算v2 + lit16并将结果存入v0。
    #sub-int/lit16 v0, v2, 0x1	#opcode=0xD1	sub-int/lit16 v0, v2, lit16	计算v2 - lit16并将结果存入v0。 蛋疼5这条指令不能写
    mul-int/lit16 v0, v2, 0x1	#opcode=0xD2	mul-int/lit16 v0, v2, lit16	计算v2 * lit16并将结果存入v0。
    div-int/lit16 v0, v2, 0x1	#opcode=0xD3	div-int/lit16 v0, v2, lit16	计算v2 / lit16并将结果存入v0。
    rem-int/lit16 v0, v2, 0x1	#opcode=0xD4	rem-int/lit16 v0, v2, lit16	计算v2 % lit16并将结果存入v0。
    and-int/lit16 v0, v2, 0x1	#opcode=0xD5	and-int/lit16 v0, v2, lit16	计算v2 与 lit16并将结果存入v0。
    or-int/lit16  v0, v2, 0x1	#opcode=0xD6	or-int/lit16 v0, v2, lit16	计算v2 或 lit16并将结果存入v0。
    xor-int/lit16 v0, v2, 0x1	#opcode=0xD7	xor-int/lit16 v0, v2, lit16	计算v2 异或 lit16并将结果存入v0。

    const/4 			v0, 0x5
   	const/4 			v2, 0x6
    add-int/lit8 v0, v2, 0x1	#opcode=0xD8	add-int/lit8 v0, v2, lit8	计算v2 + lit8并将结果存入v0。
    #sub-int/lit8 v0, v2, 0x1	#opcode=0xD9	sub-int/lit8 v0, v2, lit8	计算v2 - lit8并将结果存入v0。 蛋疼6这条指令不能写
    mul-int/lit8 v0, v2, 0x1	#opcode=0xDA	mul-int/lit8 v0, v2, lit8	计算v2 * lit8并将结果存入v0。
    div-int/lit8 v0, v2, 0x1	#opcode=0xDB	div-int/lit8 v0, v2, lit8	计算v2 / lit8并将结果存入v0。
    rem-int/lit8 v0, v2, 0x1	#opcode=0xDC	rem-int/lit8 v0, v2, lit8	计算v2 % lit8并将结果存入v0。
    and-int/lit8 v0, v2, 0x1	#opcode=0xDD	and-int/lit8 v0, v2, lit8	计算v2 与 lit8并将结果存入v0。
    or-int/lit8 v0, v2,  0x1	#opcode=0xDE	or-int/lit8 v0, v2, lit8	计算v2 或 lit8并将结果存入v0。
    xor-int/lit8 v0, v2, 0x1	#opcode=0xDF	xor-int/lit8 v0, v2, lit8	计算v2异或lit8并将结果存入v0。
    shl-int/lit8 v0, v2, 0x1	#opcode=0xE0	shl-int/lit8 v0, v2, lit8	左移v2，lit8指定移动的位置，并将结果存入v0。
    shr-int/lit8 v0, v2, 0x1	#opcode=0xE1	shr-int/lit8 v0, v2, lit8	右移v2，lit8指定移动的位置，并将结果存入v0。
    ushr-int/lit8 v0, v2, 0x1	#opcode=0xE2	ushr-int/lit8 v0, v2, lit8	无符号右移v2，lit8指定移动的位置，并将结果存入v0。
    #下面编译生成===============================================
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V      #invoke-super,opcode=6F
    const/high16 v0, 0x7f030000
    invoke-virtual {p0, v0}, Lcom/snow/alldalvikopcode/MainActivity;->setContentView(I)V
	
	#三、返回指令4条 无法测试
    return-void				#opcode=0xE
    #return vAA				#opcode=0xF,onCreate默认返回void，无法写这里，蛋疼7
	#return-wide vAA		#opcode=0x10,onCreate默认返回void，无法写这里，蛋疼8
	#return-object vAA		#opcode=0x11,onCreate默认返回void，无法写这里，蛋疼9
    
        
   	#下面是数组数据
	:array_0
	.array-data 4
        0x11
        0x22
        0x33
        0x44
    .end array-data
    
     :array_1
    .array-data 8
        0x37
        0x42
        0x4d
        0x58
    .end array-data
    
    :array_2
    .array-data 1
        0x1t
        0x2t
        0x3t
        0x4t
    .end array-data
    
    :array_3
    .array-data 2
        0x73s
        0x6es
        0x6fs
        0x77s
    .end array-data
    
    :array_4
    .array-data 2
        0x5s
        0x6s
        0x7s
        0x8s
    .end array-data
   	#下面是switch数据1
	:pswitch_data_0
	.packed-switch 0x1
		:pswitch_0
		:pswitch_1
	.end packed-switch
	
	#下面是switch数据2
	:sswitch_data_0
	.sparse-switch
		0x1 -> :sswitch_0
		0x2 -> :sswitch_1
	.end sparse-switch
.end method

.method public virtualfunc(I)I
    .locals 2
    .param p1, "a1"    # I

    .prologue
    .line 82
    const-string v0, "snow_testjiagu"

    const-string v1, "----invoke-virtual---"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 83
    add-int/lit8 v0, p1, 0x1

    return v0
.end method

.method public virtualrangefunc(IIIII)I
    .locals 2
    .param p1, "a1"    # I
    .param p2, "a2"    # I
    .param p3, "a3"    # I
    .param p4, "a4"    # I
    .param p5, "a5"    # I

    .prologue
    .line 155
    const-string v0, "snow_testjiagu"

    const-string v1, "----invoke-virtual/range---"

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    add-int v0, p1, p2

    add-int/2addr v0, p3

    add-int/2addr v0, p4

    add-int/lit8 v0, v0, 0x1

    return v0
.end method