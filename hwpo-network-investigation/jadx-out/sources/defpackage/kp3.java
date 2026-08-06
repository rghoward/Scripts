package defpackage;

import android.os.Bundle;
import androidx.fragment.app.i;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kp3 implements gb6.a, mb2 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ kp3(int i, Object obj, Object obj2) {
        this.t = i;
        this.u = obj;
        this.v = obj2;
    }

    @Override // defpackage.mb2
    public Object c(i iVar) {
        String str = (String) this.u;
        String str2 = (String) this.v;
        iVar.getClass();
        t61.Companion.getClass();
        str.getClass();
        t61 t61Var = new t61();
        Bundle bundle = new Bundle();
        bundle.putInt("com.fitr_training.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsFragment.ID", this.t);
        bundle.putString("com.fitr_training.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsFragment.DATE", str2);
        bundle.putString("com.fitr_training.tracking.presentation.entry_details.challenge.ChallengeEntryDetailsFragment.TITLE", str);
        t61Var.setArguments(bundle);
        return t61Var;
    }

    @Override // gb6.a
    public void invoke(Object obj) {
        s28.d dVar = (s28.d) this.u;
        s28.d dVar2 = (s28.d) this.v;
        s28.c cVar = (s28.c) obj;
        cVar.getClass();
        cVar.o(dVar, dVar2, this.t);
    }
}
