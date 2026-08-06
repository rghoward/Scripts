package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c66 extends x2 {
    public final /* synthetic */ g66 a;

    public c66(g66 g66Var) {
        this.a = g66Var;
    }

    @Override // defpackage.x2, defpackage.fsb
    public final void b(rrb rrbVar) {
        rrbVar.getClass();
        g66 g66Var = this.a;
        g66Var.setYouTubePlayerReady$youtube_player(true);
        HashSet<esb> hashSet = g66Var.y;
        Iterator<esb> it = hashSet.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        hashSet.clear();
        rrbVar.e(this);
    }
}
