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
public final class vu3 {
    public static final vu3 u;
    public static final vu3 v;
    public static final vu3[] w;
    public static final /* synthetic */ vu3[] x;
    public final int t;

    /* JADX INFO: Fake field, exist only in values array */
    vu3 EF0;

    static {
        cl5 cl5Var = cl5.x;
        vu3 vu3Var = new vu3("DOUBLE", 0, 0, 1, cl5Var);
        cl5 cl5Var2 = cl5.w;
        vu3 vu3Var2 = new vu3("FLOAT", 1, 1, 1, cl5Var2);
        cl5 cl5Var3 = cl5.v;
        vu3 vu3Var3 = new vu3("INT64", 2, 2, 1, cl5Var3);
        vu3 vu3Var4 = new vu3("UINT64", 3, 3, 1, cl5Var3);
        cl5 cl5Var4 = cl5.u;
        vu3 vu3Var5 = new vu3("INT32", 4, 4, 1, cl5Var4);
        vu3 vu3Var6 = new vu3("FIXED64", 5, 5, 1, cl5Var3);
        vu3 vu3Var7 = new vu3("FIXED32", 6, 6, 1, cl5Var4);
        cl5 cl5Var5 = cl5.y;
        vu3 vu3Var8 = new vu3("BOOL", 7, 7, 1, cl5Var5);
        cl5 cl5Var6 = cl5.z;
        vu3 vu3Var9 = new vu3("STRING", 8, 8, 1, cl5Var6);
        cl5 cl5Var7 = cl5.C;
        vu3 vu3Var10 = new vu3("MESSAGE", 9, 9, 1, cl5Var7);
        cl5 cl5Var8 = cl5.A;
        vu3 vu3Var11 = new vu3("BYTES", 10, 10, 1, cl5Var8);
        vu3 vu3Var12 = new vu3("UINT32", 11, 11, 1, cl5Var4);
        cl5 cl5Var9 = cl5.B;
        vu3 vu3Var13 = new vu3("ENUM", 12, 12, 1, cl5Var9);
        vu3 vu3Var14 = new vu3("SFIXED32", 13, 13, 1, cl5Var4);
        vu3 vu3Var15 = new vu3("SFIXED64", 14, 14, 1, cl5Var3);
        vu3 vu3Var16 = new vu3("SINT32", 15, 15, 1, cl5Var4);
        vu3 vu3Var17 = new vu3("SINT64", 16, 16, 1, cl5Var3);
        vu3 vu3Var18 = new vu3("GROUP", 17, 17, 1, cl5Var7);
        vu3 vu3Var19 = new vu3("DOUBLE_LIST", 18, 18, 2, cl5Var);
        vu3 vu3Var20 = new vu3("FLOAT_LIST", 19, 19, 2, cl5Var2);
        vu3 vu3Var21 = new vu3("INT64_LIST", 20, 20, 2, cl5Var3);
        vu3 vu3Var22 = new vu3("UINT64_LIST", 21, 21, 2, cl5Var3);
        vu3 vu3Var23 = new vu3("INT32_LIST", 22, 22, 2, cl5Var4);
        vu3 vu3Var24 = new vu3("FIXED64_LIST", 23, 23, 2, cl5Var3);
        vu3 vu3Var25 = new vu3("FIXED32_LIST", 24, 24, 2, cl5Var4);
        vu3 vu3Var26 = new vu3("BOOL_LIST", 25, 25, 2, cl5Var5);
        vu3 vu3Var27 = new vu3("STRING_LIST", 26, 26, 2, cl5Var6);
        vu3 vu3Var28 = new vu3("MESSAGE_LIST", 27, 27, 2, cl5Var7);
        vu3 vu3Var29 = new vu3("BYTES_LIST", 28, 28, 2, cl5Var8);
        vu3 vu3Var30 = new vu3("UINT32_LIST", 29, 29, 2, cl5Var4);
        vu3 vu3Var31 = new vu3("ENUM_LIST", 30, 30, 2, cl5Var9);
        vu3 vu3Var32 = new vu3("SFIXED32_LIST", 31, 31, 2, cl5Var4);
        vu3 vu3Var33 = new vu3("SFIXED64_LIST", 32, 32, 2, cl5Var3);
        vu3 vu3Var34 = new vu3("SINT32_LIST", 33, 33, 2, cl5Var4);
        vu3 vu3Var35 = new vu3("SINT64_LIST", 34, 34, 2, cl5Var3);
        vu3 vu3Var36 = new vu3("DOUBLE_LIST_PACKED", 35, 35, 3, cl5Var);
        u = vu3Var36;
        vu3 vu3Var37 = new vu3("FLOAT_LIST_PACKED", 36, 36, 3, cl5Var2);
        vu3 vu3Var38 = new vu3("INT64_LIST_PACKED", 37, 37, 3, cl5Var3);
        vu3 vu3Var39 = new vu3("UINT64_LIST_PACKED", 38, 38, 3, cl5Var3);
        vu3 vu3Var40 = new vu3("INT32_LIST_PACKED", 39, 39, 3, cl5Var4);
        vu3 vu3Var41 = new vu3("FIXED64_LIST_PACKED", 40, 40, 3, cl5Var3);
        vu3 vu3Var42 = new vu3("FIXED32_LIST_PACKED", 41, 41, 3, cl5Var4);
        vu3 vu3Var43 = new vu3("BOOL_LIST_PACKED", 42, 42, 3, cl5Var5);
        vu3 vu3Var44 = new vu3("UINT32_LIST_PACKED", 43, 43, 3, cl5Var4);
        vu3 vu3Var45 = new vu3("ENUM_LIST_PACKED", 44, 44, 3, cl5Var9);
        vu3 vu3Var46 = new vu3("SFIXED32_LIST_PACKED", 45, 45, 3, cl5Var4);
        vu3 vu3Var47 = new vu3("SFIXED64_LIST_PACKED", 46, 46, 3, cl5Var3);
        vu3 vu3Var48 = new vu3("SINT32_LIST_PACKED", 47, 47, 3, cl5Var4);
        vu3 vu3Var49 = new vu3("SINT64_LIST_PACKED", 48, 48, 3, cl5Var3);
        v = vu3Var49;
        x = new vu3[]{vu3Var, vu3Var2, vu3Var3, vu3Var4, vu3Var5, vu3Var6, vu3Var7, vu3Var8, vu3Var9, vu3Var10, vu3Var11, vu3Var12, vu3Var13, vu3Var14, vu3Var15, vu3Var16, vu3Var17, vu3Var18, vu3Var19, vu3Var20, vu3Var21, vu3Var22, vu3Var23, vu3Var24, vu3Var25, vu3Var26, vu3Var27, vu3Var28, vu3Var29, vu3Var30, vu3Var31, vu3Var32, vu3Var33, vu3Var34, vu3Var35, vu3Var36, vu3Var37, vu3Var38, vu3Var39, vu3Var40, vu3Var41, vu3Var42, vu3Var43, vu3Var44, vu3Var45, vu3Var46, vu3Var47, vu3Var48, vu3Var49, new vu3("GROUP_LIST", 49, 49, 2, cl5Var7), new vu3("MAP", 50, 50, 4, cl5.t)};
        vu3[] vu3VarArrValues = values();
        w = new vu3[vu3VarArrValues.length];
        for (vu3 vu3Var50 : vu3VarArrValues) {
            w[vu3Var50.t] = vu3Var50;
        }
    }

    public vu3(String str, int i, int i2, int i3, cl5 cl5Var) {
        super(str, i);
        this.t = i2;
        int iA = uu3.a(i3);
        if (iA == 1 || iA == 3) {
            cl5Var.getClass();
        }
        if (i3 == 1) {
            cl5Var.ordinal();
        }
    }

    public static vu3 valueOf(String str) {
        return (vu3) Enum.valueOf(vu3.class, str);
    }

    public static vu3[] values() {
        return (vu3[]) x.clone();
    }
}
