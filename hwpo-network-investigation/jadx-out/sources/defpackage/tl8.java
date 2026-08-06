package defpackage;

import android.os.Trace;
import com.bumptech.glide.a;
import com.bumptech.glide.e;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tl8 implements vm4<sl8> {
    public boolean a;
    public final /* synthetic */ a b;
    public final /* synthetic */ List c;
    public final /* synthetic */ v00 d;

    public tl8(a aVar, List list, v00 v00Var) {
        this.b = aVar;
        this.c = list;
        this.d = v00Var;
    }

    @Override // defpackage.vm4
    public final sl8 get() {
        if (this.a) {
            aa0.c("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        wra.a("Glide registry");
        this.a = true;
        try {
            return e.a(this.b, this.c, this.d);
        } finally {
            this.a = false;
            Trace.endSection();
        }
    }
}
