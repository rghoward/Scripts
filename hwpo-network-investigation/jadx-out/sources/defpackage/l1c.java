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
public final class l1c {
    public static final l1c u;
    public static final l1c v;
    public static final l1c[] w;
    public static final /* synthetic */ l1c[] x;
    public final int t;

    /* JADX INFO: Fake field, exist only in values array */
    l1c EF0;

    static {
        l2c l2cVar = l2c.x;
        l1c l1cVar = new l1c("DOUBLE", 0, 0, 1, l2cVar);
        l2c l2cVar2 = l2c.w;
        l1c l1cVar2 = new l1c("FLOAT", 1, 1, 1, l2cVar2);
        l2c l2cVar3 = l2c.v;
        l1c l1cVar3 = new l1c("INT64", 2, 2, 1, l2cVar3);
        l1c l1cVar4 = new l1c("UINT64", 3, 3, 1, l2cVar3);
        l2c l2cVar4 = l2c.u;
        l1c l1cVar5 = new l1c("INT32", 4, 4, 1, l2cVar4);
        l1c l1cVar6 = new l1c("FIXED64", 5, 5, 1, l2cVar3);
        l1c l1cVar7 = new l1c("FIXED32", 6, 6, 1, l2cVar4);
        l2c l2cVar5 = l2c.y;
        l1c l1cVar8 = new l1c("BOOL", 7, 7, 1, l2cVar5);
        l2c l2cVar6 = l2c.z;
        l1c l1cVar9 = new l1c("STRING", 8, 8, 1, l2cVar6);
        l2c l2cVar7 = l2c.C;
        l1c l1cVar10 = new l1c("MESSAGE", 9, 9, 1, l2cVar7);
        l2c l2cVar8 = l2c.A;
        l1c l1cVar11 = new l1c("BYTES", 10, 10, 1, l2cVar8);
        l1c l1cVar12 = new l1c("UINT32", 11, 11, 1, l2cVar4);
        l2c l2cVar9 = l2c.B;
        l1c l1cVar13 = new l1c("ENUM", 12, 12, 1, l2cVar9);
        l1c l1cVar14 = new l1c("SFIXED32", 13, 13, 1, l2cVar4);
        l1c l1cVar15 = new l1c("SFIXED64", 14, 14, 1, l2cVar3);
        l1c l1cVar16 = new l1c("SINT32", 15, 15, 1, l2cVar4);
        l1c l1cVar17 = new l1c("SINT64", 16, 16, 1, l2cVar3);
        l1c l1cVar18 = new l1c("GROUP", 17, 17, 1, l2cVar7);
        l1c l1cVar19 = new l1c("DOUBLE_LIST", 18, 18, 2, l2cVar);
        l1c l1cVar20 = new l1c("FLOAT_LIST", 19, 19, 2, l2cVar2);
        l1c l1cVar21 = new l1c("INT64_LIST", 20, 20, 2, l2cVar3);
        l1c l1cVar22 = new l1c("UINT64_LIST", 21, 21, 2, l2cVar3);
        l1c l1cVar23 = new l1c("INT32_LIST", 22, 22, 2, l2cVar4);
        l1c l1cVar24 = new l1c("FIXED64_LIST", 23, 23, 2, l2cVar3);
        l1c l1cVar25 = new l1c("FIXED32_LIST", 24, 24, 2, l2cVar4);
        l1c l1cVar26 = new l1c("BOOL_LIST", 25, 25, 2, l2cVar5);
        l1c l1cVar27 = new l1c("STRING_LIST", 26, 26, 2, l2cVar6);
        l1c l1cVar28 = new l1c("MESSAGE_LIST", 27, 27, 2, l2cVar7);
        l1c l1cVar29 = new l1c("BYTES_LIST", 28, 28, 2, l2cVar8);
        l1c l1cVar30 = new l1c("UINT32_LIST", 29, 29, 2, l2cVar4);
        l1c l1cVar31 = new l1c("ENUM_LIST", 30, 30, 2, l2cVar9);
        l1c l1cVar32 = new l1c("SFIXED32_LIST", 31, 31, 2, l2cVar4);
        l1c l1cVar33 = new l1c("SFIXED64_LIST", 32, 32, 2, l2cVar3);
        l1c l1cVar34 = new l1c("SINT32_LIST", 33, 33, 2, l2cVar4);
        l1c l1cVar35 = new l1c("SINT64_LIST", 34, 34, 2, l2cVar3);
        l1c l1cVar36 = new l1c("DOUBLE_LIST_PACKED", 35, 35, 3, l2cVar);
        u = l1cVar36;
        l1c l1cVar37 = new l1c("FLOAT_LIST_PACKED", 36, 36, 3, l2cVar2);
        l1c l1cVar38 = new l1c("INT64_LIST_PACKED", 37, 37, 3, l2cVar3);
        l1c l1cVar39 = new l1c("UINT64_LIST_PACKED", 38, 38, 3, l2cVar3);
        l1c l1cVar40 = new l1c("INT32_LIST_PACKED", 39, 39, 3, l2cVar4);
        l1c l1cVar41 = new l1c("FIXED64_LIST_PACKED", 40, 40, 3, l2cVar3);
        l1c l1cVar42 = new l1c("FIXED32_LIST_PACKED", 41, 41, 3, l2cVar4);
        l1c l1cVar43 = new l1c("BOOL_LIST_PACKED", 42, 42, 3, l2cVar5);
        l1c l1cVar44 = new l1c("UINT32_LIST_PACKED", 43, 43, 3, l2cVar4);
        l1c l1cVar45 = new l1c("ENUM_LIST_PACKED", 44, 44, 3, l2cVar9);
        l1c l1cVar46 = new l1c("SFIXED32_LIST_PACKED", 45, 45, 3, l2cVar4);
        l1c l1cVar47 = new l1c("SFIXED64_LIST_PACKED", 46, 46, 3, l2cVar3);
        l1c l1cVar48 = new l1c("SINT32_LIST_PACKED", 47, 47, 3, l2cVar4);
        l1c l1cVar49 = new l1c("SINT64_LIST_PACKED", 48, 48, 3, l2cVar3);
        v = l1cVar49;
        x = new l1c[]{l1cVar, l1cVar2, l1cVar3, l1cVar4, l1cVar5, l1cVar6, l1cVar7, l1cVar8, l1cVar9, l1cVar10, l1cVar11, l1cVar12, l1cVar13, l1cVar14, l1cVar15, l1cVar16, l1cVar17, l1cVar18, l1cVar19, l1cVar20, l1cVar21, l1cVar22, l1cVar23, l1cVar24, l1cVar25, l1cVar26, l1cVar27, l1cVar28, l1cVar29, l1cVar30, l1cVar31, l1cVar32, l1cVar33, l1cVar34, l1cVar35, l1cVar36, l1cVar37, l1cVar38, l1cVar39, l1cVar40, l1cVar41, l1cVar42, l1cVar43, l1cVar44, l1cVar45, l1cVar46, l1cVar47, l1cVar48, l1cVar49, new l1c("GROUP_LIST", 49, 49, 2, l2cVar7), new l1c("MAP", 50, 50, 4, l2c.t)};
        l1c[] l1cVarArrValues = values();
        w = new l1c[l1cVarArrValues.length];
        for (l1c l1cVar50 : l1cVarArrValues) {
            w[l1cVar50.t] = l1cVar50;
        }
    }

    public l1c(String str, int i, int i2, int i3, l2c l2cVar) {
        super(str, i);
        this.t = i2;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            l2cVar.getClass();
        }
        if (i3 == 1) {
            l2c l2cVar2 = l2c.t;
            l2cVar.ordinal();
        }
    }

    public static l1c[] values() {
        return (l1c[]) x.clone();
    }
}
