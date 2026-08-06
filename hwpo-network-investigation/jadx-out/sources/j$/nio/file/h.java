package j$.nio.file;

import java.io.Closeable;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements Closeable {
    public abstract Iterable a();

    public abstract Path b(String str, String... strArr);

    public abstract x c(String str);

    public abstract Iterable d();

    public abstract String e();

    public abstract j$.nio.file.attribute.a0 f();

    public abstract boolean g();

    public abstract g0 h();

    public abstract j$.nio.file.spi.c i();

    public abstract boolean isOpen();

    public abstract Set j();
}
