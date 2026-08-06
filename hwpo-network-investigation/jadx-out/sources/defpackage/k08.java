package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class k08 {
    public static final ep a;
    public static final kl8 b;
    public static final qy0 c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            a = null;
            b = new kl8();
            c = new qy0();
        } else if (property.equals("Dalvik")) {
            a = new ep();
            b = new kl8.a();
            c = new qy0.a();
        } else {
            a = null;
            b = new kl8.b();
            c = new qy0.a();
        }
    }
}
