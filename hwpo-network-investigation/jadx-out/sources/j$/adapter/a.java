package j$.adapter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final boolean a;
    public static final boolean b;

    static {
        boolean z;
        try {
            Class.forName("java.util.StringJoiner");
        } catch (ClassNotFoundException unused) {
        }
        boolean z2 = false;
        try {
            Class.forName("java.nio.file.FileSystems");
            z = true;
        } catch (ClassNotFoundException unused2) {
            z = false;
        }
        a = z;
        try {
            Class.forName("android.os.Build");
            z2 = true;
        } catch (ClassNotFoundException unused3) {
        }
        b = z2;
    }
}
