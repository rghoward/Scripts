package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vc6<T> implements xe2<T> {
    public final boolean t;
    public final Uri u;
    public final ContentResolver v;
    public T w;

    public vc6(ContentResolver contentResolver, Uri uri, boolean z) {
        this.v = contentResolver;
        this.u = uri;
        this.t = z;
    }

    @Override // defpackage.xe2
    public final void b() {
        T t = this.w;
        if (t != null) {
            try {
                d(t);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Object] */
    @Override // defpackage.xe2
    public final void c(p98 p98Var, xe2.a<? super T> aVar) {
        try {
            ?? r2 = (T) e(this.v, this.u);
            this.w = r2;
            aVar.e(r2);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            aVar.d(e);
        }
    }

    public abstract void d(T t);

    public abstract Object e(ContentResolver contentResolver, Uri uri);

    @Override // defpackage.xe2
    public final kf2 getDataSource() {
        return kf2.t;
    }

    @Override // defpackage.xe2
    public final void cancel() {
    }
}
