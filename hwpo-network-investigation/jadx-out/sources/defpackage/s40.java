package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s40<T> implements xe2<T> {
    public final String t;
    public final AssetManager u;
    public T v;

    public s40(AssetManager assetManager, String str) {
        this.u = assetManager;
        this.t = str;
    }

    @Override // defpackage.xe2
    public final void b() {
        T t = this.v;
        if (t == null) {
            return;
        }
        try {
            d(t);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.xe2
    public final void c(p98 p98Var, xe2.a<? super T> aVar) {
        try {
            T tE = e(this.u, this.t);
            this.v = tE;
            aVar.e(tE);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            aVar.d(e);
        }
    }

    public abstract void d(T t);

    public abstract T e(AssetManager assetManager, String str);

    @Override // defpackage.xe2
    public final kf2 getDataSource() {
        return kf2.t;
    }

    @Override // defpackage.xe2
    public final void cancel() {
    }
}
