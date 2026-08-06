package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public class fob {
    public static final a v;
    public static final b w;
    public static final c x;
    public static final /* synthetic */ fob[] y;
    public final iob t;
    public final int u;

    /* JADX INFO: Fake field, exist only in values array */
    fob EF0;

    /* JADX INFO: Fake field, exist only in values array */
    fob EF1;

    /* JADX INFO: Fake field, exist only in values array */
    fob EF2;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final enum a extends fob {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final enum b extends fob {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final enum c extends fob {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final enum d extends fob {
    }

    static {
        fob fobVar = new fob("DOUBLE", 0, iob.w, 1);
        fob fobVar2 = new fob("FLOAT", 1, iob.v, 5);
        iob iobVar = iob.u;
        fob fobVar3 = new fob("INT64", 2, iobVar, 0);
        fob fobVar4 = new fob("UINT64", 3, iobVar, 0);
        iob iobVar2 = iob.t;
        fob fobVar5 = new fob("INT32", 4, iobVar2, 0);
        fob fobVar6 = new fob("FIXED64", 5, iobVar, 1);
        fob fobVar7 = new fob("FIXED32", 6, iobVar2, 5);
        fob fobVar8 = new fob("BOOL", 7, iob.x, 0);
        a aVar = new a("STRING", 8, iob.y, 2);
        v = aVar;
        iob iobVar3 = iob.B;
        b bVar = new b("GROUP", 9, iobVar3, 3);
        w = bVar;
        c cVar = new c("MESSAGE", 10, iobVar3, 2);
        x = cVar;
        y = new fob[]{fobVar, fobVar2, fobVar3, fobVar4, fobVar5, fobVar6, fobVar7, fobVar8, aVar, bVar, cVar, new d("BYTES", 11, iob.z, 2), new fob("UINT32", 12, iobVar2, 0), new fob("ENUM", 13, iob.A, 0), new fob("SFIXED32", 14, iobVar2, 5), new fob("SFIXED64", 15, iobVar, 1), new fob("SINT32", 16, iobVar2, 0), new fob("SINT64", 17, iobVar, 0)};
    }

    public fob(String str, int i, iob iobVar, int i2) {
        super(str, i);
        this.t = iobVar;
        this.u = i2;
    }

    public static fob valueOf(String str) {
        return (fob) Enum.valueOf(fob.class, str);
    }

    public static fob[] values() {
        return (fob[]) y.clone();
    }
}
