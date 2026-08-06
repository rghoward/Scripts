package defpackage;

import android.widget.LinearLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b81 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ b81(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ya yaVar = (ya) obj;
                yaVar.getClass();
                MaterialCardView materialCardView = ((r96) yaVar.u).a;
                materialCardView.getClass();
                xgb.a(materialCardView, new f81((rbb.b) obj2, yaVar, null));
                yaVar.s(new c81(yaVar, 0));
                break;
            default:
                ya yaVar2 = (ya) obj;
                yaVar2.getClass();
                LinearLayout linearLayout = ((aa6) yaVar2.u).a;
                linearLayout.getClass();
                xgb.a(linearLayout, new wv3((vo6.c) obj2, yaVar2, null));
                yaVar2.s(new nm0(2, yaVar2));
                break;
        }
        return g2b.a;
    }
}
