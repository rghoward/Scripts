package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class iob {
    public static final iob A;
    public static final iob B;
    public static final /* synthetic */ iob[] C;
    public static final iob t;
    public static final iob u;
    public static final iob v;
    public static final iob w;
    public static final iob x;
    public static final iob y;
    public static final iob z;

    static {
        iob iobVar = new iob("INT", 0);
        t = iobVar;
        iob iobVar2 = new iob("LONG", 1);
        u = iobVar2;
        iob iobVar3 = new iob("FLOAT", 2);
        v = iobVar3;
        iob iobVar4 = new iob("DOUBLE", 3);
        w = iobVar4;
        iob iobVar5 = new iob("BOOLEAN", 4);
        x = iobVar5;
        iob iobVar6 = new iob("STRING", 5);
        y = iobVar6;
        e01.f fVar = e01.u;
        iob iobVar7 = new iob("BYTE_STRING", 6);
        z = iobVar7;
        iob iobVar8 = new iob("ENUM", 7);
        A = iobVar8;
        iob iobVar9 = new iob("MESSAGE", 8);
        B = iobVar9;
        C = new iob[]{iobVar, iobVar2, iobVar3, iobVar4, iobVar5, iobVar6, iobVar7, iobVar8, iobVar9};
    }

    public static iob valueOf(String str) {
        return (iob) Enum.valueOf(iob.class, str);
    }

    public static iob[] values() {
        return (iob[]) C.clone();
    }
}
