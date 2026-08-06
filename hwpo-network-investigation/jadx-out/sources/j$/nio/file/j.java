package j$.nio.file;

import java.net.URI;
import java.security.AccessController;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    public static final h a = ((j$.nio.file.spi.c) AccessController.doPrivileged(new i(0))).j(URI.create("file:///"));
}
