package defpackage;

import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rs9 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ rs9(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ((ms9) obj).dismiss();
                return Boolean.TRUE;
            default:
                o8b o8bVar = (o8b) obj;
                o8b.a aVar = o8b.Companion;
                final o8b.b bVar = new o8b.b(1, o8bVar.r(), o9b.class, "onItemClicked", "onItemClicked(Lcom/hwpo_training_app/tracking/presentation/value_details/model/DetailValueModel;)V", 0);
                final o8b.c cVar = new o8b.c(1, o8bVar.r(), o9b.class, "onMoreClicked", "onMoreClicked(Lcom/hwpo_training_app/tracking/presentation/value_details/model/DetailValueModel;)V", 0);
                e8b e8bVar = new e8b(new e8b.a());
                e8bVar.d.b(new e93(new y7b(), new a8b(3), new oh4() { // from class: z7b
                    @Override // defpackage.oh4
                    public final Object invoke(Object obj2) {
                        ya yaVar = (ya) obj2;
                        yaVar.getClass();
                        ra6 ra6Var = (ra6) yaVar.u;
                        MaterialCardView materialCardView = ra6Var.a;
                        materialCardView.getClass();
                        xgb.a(materialCardView, new b8b(bVar, yaVar, null));
                        xgb.a(ra6Var.c, new c8b(cVar, yaVar, null));
                        yaVar.s(new vk3(2, yaVar));
                        return g2b.a;
                    }
                }, e69.w));
                return e8bVar;
        }
    }
}
