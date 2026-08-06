package j$.nio.file;

import java.nio.file.WatchKey;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f0 {
    public final /* synthetic */ WatchKey a;

    public /* synthetic */ f0(WatchKey watchKey) {
        this.a = watchKey;
    }

    public static /* synthetic */ f0 a(WatchKey watchKey) {
        if (watchKey == null) {
            return null;
        }
        return new f0(watchKey);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchKey watchKey = this.a;
        if (obj instanceof f0) {
            obj = ((f0) obj).a;
        }
        return watchKey.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
