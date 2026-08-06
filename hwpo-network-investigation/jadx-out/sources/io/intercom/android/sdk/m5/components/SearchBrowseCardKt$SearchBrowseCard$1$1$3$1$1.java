package io.intercom.android.sdk.m5.components;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.r02;
import defpackage.t72;
import defpackage.xm2;
import io.intercom.android.sdk.m5.home.data.SuggestedArticle;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.components.SearchBrowseCardKt$SearchBrowseCard$1$1$3$1$1", f = "SearchBrowseCard.kt", l = {}, m = "invokeSuspend")
public final class SearchBrowseCardKt$SearchBrowseCard$1$1$3$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ List<SuggestedArticle> $articleSuggestions;
    final /* synthetic */ MetricTracker $metricTracker;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBrowseCardKt$SearchBrowseCard$1$1$3$1$1(MetricTracker metricTracker, List<SuggestedArticle> list, r02<? super SearchBrowseCardKt$SearchBrowseCard$1$1$3$1$1> r02Var) {
        super(2, r02Var);
        this.$metricTracker = metricTracker;
        this.$articleSuggestions = list;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new SearchBrowseCardKt$SearchBrowseCard$1$1$3$1$1(this.$metricTracker, this.$articleSuggestions, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((SearchBrowseCardKt$SearchBrowseCard$1$1$3$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        MetricTracker metricTracker = this.$metricTracker;
        List<SuggestedArticle> list = this.$articleSuggestions;
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((SuggestedArticle) it.next()).getId());
        }
        metricTracker.viewedArticleSuggestions(arrayList);
        return g2b.a;
    }
}
