package defpackage;

import android.os.FileObserver;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e17 extends FileObserver {
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public final CopyOnWriteArrayList<oh4<String, g2b>> a;

    public e17(String str) {
        super(str, 128);
        this.a = new CopyOnWriteArrayList<>();
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((oh4) it.next()).invoke(str);
        }
    }
}
