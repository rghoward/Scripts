package androidx.emoji2.text;

import android.os.Build;
import defpackage.le3;
import defpackage.me3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d.i {
    public final /* synthetic */ d.a a;

    public c(d.a aVar) {
        this.a = aVar;
    }

    @Override // androidx.emoji2.text.d.i
    public final void a(Throwable th) {
        this.a.a.f(th);
    }

    @Override // androidx.emoji2.text.d.i
    public final void b(h hVar) {
        d.a aVar = this.a;
        aVar.c = hVar;
        h hVar2 = aVar.c;
        d dVar = aVar.a;
        aVar.b = new f(hVar2, dVar.g, dVar.i, Build.VERSION.SDK_INT >= 34 ? le3.a() : me3.a());
        d dVar2 = aVar.a;
        ArrayList arrayList = new ArrayList();
        dVar2.a.writeLock().lock();
        try {
            dVar2.c = 1;
            arrayList.addAll(dVar2.b);
            dVar2.b.clear();
            dVar2.a.writeLock().unlock();
            dVar2.d.post(new d.g(arrayList, dVar2.c, null));
        } catch (Throwable th) {
            dVar2.a.writeLock().unlock();
            throw th;
        }
    }
}
