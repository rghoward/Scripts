package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zu extends AnimatorListenerAdapter {
    public final /* synthetic */ yu a;

    public zu(yu yuVar) {
        this.a = yuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        yu yuVar = this.a;
        ArrayList arrayList = new ArrayList(yuVar.x);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((tt) arrayList.get(i)).a(yuVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        yu yuVar = this.a;
        ArrayList arrayList = new ArrayList(yuVar.x);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((tt) arrayList.get(i)).b(yuVar);
        }
    }
}
