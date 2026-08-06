package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hob {
    public static final hob A;
    public static final hob B;
    public static final /* synthetic */ hob[] C;
    public static final hob t;
    public static final hob u;
    public static final hob v;
    public static final hob w;
    public static final hob x;
    public static final hob y;
    public static final hob z;

    static {
        hob hobVar = new hob("INT", 0);
        t = hobVar;
        hob hobVar2 = new hob("LONG", 1);
        u = hobVar2;
        hob hobVar3 = new hob("FLOAT", 2);
        v = hobVar3;
        hob hobVar4 = new hob("DOUBLE", 3);
        w = hobVar4;
        hob hobVar5 = new hob("BOOLEAN", 4);
        x = hobVar5;
        hob hobVar6 = new hob("STRING", 5);
        y = hobVar6;
        f01.e eVar = f01.u;
        hob hobVar7 = new hob("BYTE_STRING", 6);
        z = hobVar7;
        hob hobVar8 = new hob("ENUM", 7);
        A = hobVar8;
        hob hobVar9 = new hob("MESSAGE", 8);
        B = hobVar9;
        C = new hob[]{hobVar, hobVar2, hobVar3, hobVar4, hobVar5, hobVar6, hobVar7, hobVar8, hobVar9};
    }

    public static hob valueOf(String str) {
        return (hob) Enum.valueOf(hob.class, str);
    }

    public static hob[] values() {
        return (hob[]) C.clone();
    }
}
