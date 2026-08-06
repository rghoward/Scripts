package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'v' uses external variables
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
public class gob {
    public static final gob v;
    public static final a w;
    public static final b x;
    public static final /* synthetic */ gob[] y;
    public final hob t;
    public final int u;

    /* JADX INFO: Fake field, exist only in values array */
    gob EF0;

    /* JADX INFO: Fake field, exist only in values array */
    gob EF1;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final enum a extends gob {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final enum b extends gob {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final enum c extends gob {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final enum d extends gob {
    }

    static {
        gob gobVar = new gob("DOUBLE", 0, hob.w, 1);
        gob gobVar2 = new gob("FLOAT", 1, hob.v, 5);
        hob hobVar = hob.u;
        gob gobVar3 = new gob("INT64", 2, hobVar, 0);
        v = gobVar3;
        gob gobVar4 = new gob("UINT64", 3, hobVar, 0);
        hob hobVar2 = hob.t;
        gob gobVar5 = new gob("INT32", 4, hobVar2, 0);
        gob gobVar6 = new gob("FIXED64", 5, hobVar, 1);
        gob gobVar7 = new gob("FIXED32", 6, hobVar2, 5);
        gob gobVar8 = new gob("BOOL", 7, hob.x, 0);
        a aVar = new a("STRING", 8, hob.y, 2);
        w = aVar;
        hob hobVar3 = hob.B;
        b bVar = new b("GROUP", 9, hobVar3, 3);
        x = bVar;
        y = new gob[]{gobVar, gobVar2, gobVar3, gobVar4, gobVar5, gobVar6, gobVar7, gobVar8, aVar, bVar, new c("MESSAGE", 10, hobVar3, 2), new d("BYTES", 11, hob.z, 2), new gob("UINT32", 12, hobVar2, 0), new gob("ENUM", 13, hob.A, 0), new gob("SFIXED32", 14, hobVar2, 5), new gob("SFIXED64", 15, hobVar, 1), new gob("SINT32", 16, hobVar2, 0), new gob("SINT64", 17, hobVar, 0)};
    }

    public gob(String str, int i, hob hobVar, int i2) {
        super(str, i);
        this.t = hobVar;
        this.u = i2;
    }

    public static gob valueOf(String str) {
        return (gob) Enum.valueOf(gob.class, str);
    }

    public static gob[] values() {
        return (gob[]) y.clone();
    }
}
