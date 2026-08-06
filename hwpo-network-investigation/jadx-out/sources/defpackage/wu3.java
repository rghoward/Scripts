package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wu3 {
    public static final wu3 u;
    public static final wu3 v;
    public static final wu3[] w;
    public static final /* synthetic */ wu3[] x;
    public final int t;

    /* JADX INFO: Fake field, exist only in values array */
    wu3 EF0;

    static {
        dl5 dl5Var = dl5.x;
        wu3 wu3Var = new wu3("DOUBLE", 0, 0, 1, dl5Var);
        dl5 dl5Var2 = dl5.w;
        wu3 wu3Var2 = new wu3("FLOAT", 1, 1, 1, dl5Var2);
        dl5 dl5Var3 = dl5.v;
        wu3 wu3Var3 = new wu3("INT64", 2, 2, 1, dl5Var3);
        wu3 wu3Var4 = new wu3("UINT64", 3, 3, 1, dl5Var3);
        dl5 dl5Var4 = dl5.u;
        wu3 wu3Var5 = new wu3("INT32", 4, 4, 1, dl5Var4);
        wu3 wu3Var6 = new wu3("FIXED64", 5, 5, 1, dl5Var3);
        wu3 wu3Var7 = new wu3("FIXED32", 6, 6, 1, dl5Var4);
        dl5 dl5Var5 = dl5.y;
        wu3 wu3Var8 = new wu3("BOOL", 7, 7, 1, dl5Var5);
        dl5 dl5Var6 = dl5.z;
        wu3 wu3Var9 = new wu3("STRING", 8, 8, 1, dl5Var6);
        dl5 dl5Var7 = dl5.C;
        wu3 wu3Var10 = new wu3("MESSAGE", 9, 9, 1, dl5Var7);
        dl5 dl5Var8 = dl5.A;
        wu3 wu3Var11 = new wu3("BYTES", 10, 10, 1, dl5Var8);
        wu3 wu3Var12 = new wu3("UINT32", 11, 11, 1, dl5Var4);
        dl5 dl5Var9 = dl5.B;
        wu3 wu3Var13 = new wu3("ENUM", 12, 12, 1, dl5Var9);
        wu3 wu3Var14 = new wu3("SFIXED32", 13, 13, 1, dl5Var4);
        wu3 wu3Var15 = new wu3("SFIXED64", 14, 14, 1, dl5Var3);
        wu3 wu3Var16 = new wu3("SINT32", 15, 15, 1, dl5Var4);
        wu3 wu3Var17 = new wu3("SINT64", 16, 16, 1, dl5Var3);
        wu3 wu3Var18 = new wu3("GROUP", 17, 17, 1, dl5Var7);
        wu3 wu3Var19 = new wu3("DOUBLE_LIST", 18, 18, 2, dl5Var);
        wu3 wu3Var20 = new wu3("FLOAT_LIST", 19, 19, 2, dl5Var2);
        wu3 wu3Var21 = new wu3("INT64_LIST", 20, 20, 2, dl5Var3);
        wu3 wu3Var22 = new wu3("UINT64_LIST", 21, 21, 2, dl5Var3);
        wu3 wu3Var23 = new wu3("INT32_LIST", 22, 22, 2, dl5Var4);
        wu3 wu3Var24 = new wu3("FIXED64_LIST", 23, 23, 2, dl5Var3);
        wu3 wu3Var25 = new wu3("FIXED32_LIST", 24, 24, 2, dl5Var4);
        wu3 wu3Var26 = new wu3("BOOL_LIST", 25, 25, 2, dl5Var5);
        wu3 wu3Var27 = new wu3("STRING_LIST", 26, 26, 2, dl5Var6);
        wu3 wu3Var28 = new wu3("MESSAGE_LIST", 27, 27, 2, dl5Var7);
        wu3 wu3Var29 = new wu3("BYTES_LIST", 28, 28, 2, dl5Var8);
        wu3 wu3Var30 = new wu3("UINT32_LIST", 29, 29, 2, dl5Var4);
        wu3 wu3Var31 = new wu3("ENUM_LIST", 30, 30, 2, dl5Var9);
        wu3 wu3Var32 = new wu3("SFIXED32_LIST", 31, 31, 2, dl5Var4);
        wu3 wu3Var33 = new wu3("SFIXED64_LIST", 32, 32, 2, dl5Var3);
        wu3 wu3Var34 = new wu3("SINT32_LIST", 33, 33, 2, dl5Var4);
        wu3 wu3Var35 = new wu3("SINT64_LIST", 34, 34, 2, dl5Var3);
        wu3 wu3Var36 = new wu3("DOUBLE_LIST_PACKED", 35, 35, 3, dl5Var);
        u = wu3Var36;
        wu3 wu3Var37 = new wu3("FLOAT_LIST_PACKED", 36, 36, 3, dl5Var2);
        wu3 wu3Var38 = new wu3("INT64_LIST_PACKED", 37, 37, 3, dl5Var3);
        wu3 wu3Var39 = new wu3("UINT64_LIST_PACKED", 38, 38, 3, dl5Var3);
        wu3 wu3Var40 = new wu3("INT32_LIST_PACKED", 39, 39, 3, dl5Var4);
        wu3 wu3Var41 = new wu3("FIXED64_LIST_PACKED", 40, 40, 3, dl5Var3);
        wu3 wu3Var42 = new wu3("FIXED32_LIST_PACKED", 41, 41, 3, dl5Var4);
        wu3 wu3Var43 = new wu3("BOOL_LIST_PACKED", 42, 42, 3, dl5Var5);
        wu3 wu3Var44 = new wu3("UINT32_LIST_PACKED", 43, 43, 3, dl5Var4);
        wu3 wu3Var45 = new wu3("ENUM_LIST_PACKED", 44, 44, 3, dl5Var9);
        wu3 wu3Var46 = new wu3("SFIXED32_LIST_PACKED", 45, 45, 3, dl5Var4);
        wu3 wu3Var47 = new wu3("SFIXED64_LIST_PACKED", 46, 46, 3, dl5Var3);
        wu3 wu3Var48 = new wu3("SINT32_LIST_PACKED", 47, 47, 3, dl5Var4);
        wu3 wu3Var49 = new wu3("SINT64_LIST_PACKED", 48, 48, 3, dl5Var3);
        v = wu3Var49;
        x = new wu3[]{wu3Var, wu3Var2, wu3Var3, wu3Var4, wu3Var5, wu3Var6, wu3Var7, wu3Var8, wu3Var9, wu3Var10, wu3Var11, wu3Var12, wu3Var13, wu3Var14, wu3Var15, wu3Var16, wu3Var17, wu3Var18, wu3Var19, wu3Var20, wu3Var21, wu3Var22, wu3Var23, wu3Var24, wu3Var25, wu3Var26, wu3Var27, wu3Var28, wu3Var29, wu3Var30, wu3Var31, wu3Var32, wu3Var33, wu3Var34, wu3Var35, wu3Var36, wu3Var37, wu3Var38, wu3Var39, wu3Var40, wu3Var41, wu3Var42, wu3Var43, wu3Var44, wu3Var45, wu3Var46, wu3Var47, wu3Var48, wu3Var49, new wu3("GROUP_LIST", 49, 49, 2, dl5Var7), new wu3("MAP", 50, 50, 4, dl5.t)};
        wu3[] wu3VarArrValues = values();
        w = new wu3[wu3VarArrValues.length];
        for (wu3 wu3Var50 : wu3VarArrValues) {
            w[wu3Var50.t] = wu3Var50;
        }
    }

    public wu3(String str, int i, int i2, int i3, dl5 dl5Var) {
        super(str, i);
        this.t = i2;
        int iA = uu3.a(i3);
        if (iA == 1 || iA == 3) {
            dl5Var.getClass();
        }
        if (i3 == 1) {
            dl5Var.ordinal();
        }
    }

    public static wu3 valueOf(String str) {
        return (wu3) Enum.valueOf(wu3.class, str);
    }

    public static wu3[] values() {
        return (wu3[]) x.clone();
    }
}
