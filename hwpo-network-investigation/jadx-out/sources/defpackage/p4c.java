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
public final class p4c {
    public static final p4c v;
    public static final p4c w;
    public static final p4c x;
    public static final /* synthetic */ p4c[] y;
    public final q4c t;
    public final int u;

    /* JADX INFO: Fake field, exist only in values array */
    p4c EF1;

    /* JADX INFO: Fake field, exist only in values array */
    p4c EF2;

    /* JADX INFO: Fake field, exist only in values array */
    p4c EF0;

    static {
        p4c p4cVar = new p4c("DOUBLE", 0, q4c.w, 1);
        p4c p4cVar2 = new p4c("FLOAT", 1, q4c.v, 5);
        q4c q4cVar = q4c.u;
        p4c p4cVar3 = new p4c("INT64", 2, q4cVar, 0);
        p4c p4cVar4 = new p4c("UINT64", 3, q4cVar, 0);
        q4c q4cVar2 = q4c.t;
        p4c p4cVar5 = new p4c("INT32", 4, q4cVar2, 0);
        p4c p4cVar6 = new p4c("FIXED64", 5, q4cVar, 1);
        p4c p4cVar7 = new p4c("FIXED32", 6, q4cVar2, 5);
        p4c p4cVar8 = new p4c("BOOL", 7, q4c.x, 0);
        p4c p4cVar9 = new p4c("STRING", 8, q4c.y, 2);
        v = p4cVar9;
        q4c q4cVar3 = q4c.B;
        p4c p4cVar10 = new p4c("GROUP", 9, q4cVar3, 3);
        w = p4cVar10;
        p4c p4cVar11 = new p4c("MESSAGE", 10, q4cVar3, 2);
        x = p4cVar11;
        y = new p4c[]{p4cVar, p4cVar2, p4cVar3, p4cVar4, p4cVar5, p4cVar6, p4cVar7, p4cVar8, p4cVar9, p4cVar10, p4cVar11, new p4c("BYTES", 11, q4c.z, 2), new p4c("UINT32", 12, q4cVar2, 0), new p4c("ENUM", 13, q4c.A, 0), new p4c("SFIXED32", 14, q4cVar2, 5), new p4c("SFIXED64", 15, q4cVar, 1), new p4c("SINT32", 16, q4cVar2, 0), new p4c("SINT64", 17, q4cVar, 0)};
    }

    public p4c(String str, int i, q4c q4cVar, int i2) {
        super(str, i);
        this.t = q4cVar;
        this.u = i2;
    }

    public static p4c[] values() {
        return (p4c[]) y.clone();
    }
}
