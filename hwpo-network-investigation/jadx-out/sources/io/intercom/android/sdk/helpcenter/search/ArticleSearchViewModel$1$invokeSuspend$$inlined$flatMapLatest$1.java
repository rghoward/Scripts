package io.intercom.android.sdk.helpcenter.search;

import defpackage.ei4;
import defpackage.g2b;
import defpackage.js7;
import defpackage.p6a;
import defpackage.r02;
import defpackage.s54;
import defpackage.xm2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1", f = "ArticleSearchViewModel.kt", l = {191, 189}, m = "invokeSuspend")
public final class ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 extends p6a implements ei4<s54<? super js7<? extends NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>, ? extends String>>, String, r02<? super g2b>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ ArticleSearchViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(r02 r02Var, ArticleSearchViewModel articleSearchViewModel) {
        super(3, r02Var);
        this.this$0 = articleSearchViewModel;
    }

    @Override // defpackage.ei4
    public final Object invoke(s54<? super js7<? extends NetworkResponse<? extends List<? extends HelpCenterArticleSearchResponse>>, ? extends String>> s54Var, String str, r02<? super g2b> r02Var) {
        ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1 = new ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1(r02Var, this.this$0);
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = s54Var;
        articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = str;
        return articleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r12 == r4) goto L28;
     */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 2
            r2 = 1
            r3 = 0
            v72 r4 = defpackage.v72.t
            if (r0 == 0) goto L25
            if (r0 == r2) goto L18
            if (r0 != r1) goto L12
            defpackage.dv8.b(r13)
            goto L78
        L12:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            return r3
        L18:
            java.lang.Object r0 = r12.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r2 = r12.L$0
            s54 r2 = (defpackage.s54) r2
            defpackage.dv8.b(r13)
            r9 = r12
            goto L58
        L25:
            defpackage.dv8.b(r13)
            java.lang.Object r13 = r12.L$0
            s54 r13 = (defpackage.s54) r13
            java.lang.Object r0 = r12.L$1
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r0 = r12.this$0
            io.intercom.android.sdk.helpcenter.api.HelpCenterApi r5 = io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.access$getHelpCenterApi$p(r0)
            io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel r0 = r12.this$0
            boolean r0 = io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel.access$isFromSearchBrowse$p(r0)
            if (r0 == 0) goto L43
            java.lang.String r0 = "search_browse"
            r7 = r0
            goto L44
        L43:
            r7 = r3
        L44:
            r12.L$0 = r13
            r12.L$1 = r6
            r12.label = r2
            r8 = 0
            r10 = 4
            r11 = 0
            r9 = r12
            java.lang.Object r12 = io.intercom.android.sdk.helpcenter.api.HelpCenterApi.DefaultImpls.searchForArticles$default(r5, r6, r7, r8, r9, r10, r11)
            if (r12 != r4) goto L55
            goto L77
        L55:
            r2 = r13
            r0 = r6
            r13 = r12
        L58:
            js7 r12 = new js7
            r12.<init>(r13, r0)
            r9.L$0 = r3
            r9.L$1 = r3
            r9.label = r1
            boolean r13 = r2 instanceof defpackage.lla
            if (r13 != 0) goto L7b
            java.lang.Object r12 = r2.emit(r12, r9)
            if (r12 != r4) goto L6e
            goto L70
        L6e:
            g2b r12 = defpackage.g2b.a
        L70:
            if (r12 != r4) goto L73
            goto L75
        L73:
            g2b r12 = defpackage.g2b.a
        L75:
            if (r12 != r4) goto L78
        L77:
            return r4
        L78:
            g2b r12 = defpackage.g2b.a
            return r12
        L7b:
            lla r2 = (defpackage.lla) r2
            java.lang.Throwable r12 = r2.t
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.helpcenter.search.ArticleSearchViewModel$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
