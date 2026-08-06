package defpackage;

import io.intercom.android.sdk.m5.helpcenter.ui.components.ArticleRowComponentKt;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b40 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ b40(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                return ArticleRowComponentKt.ArticleRowComponent$lambda$1$lambda$0((String) obj);
            case 1:
                return BlockViewKt.BlockView_OkTjGUA$lambda$1$lambda$0((List) obj);
            default:
                fj3.a aVar = fj3.Companion;
                List<l89> list = ((oj3) obj).h;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((l89) obj2).v == u60.w) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
        }
    }
}
