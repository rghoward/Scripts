package com.hwpo_training_app.leaderboards.details.header.domain;

import defpackage.u02;
import defpackage.xm2;
import defpackage.z97;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.header.domain.SearchTopValuesUseCase", f = "SearchTopValuesUseCase.kt", l = {z97.PERF_SESSIONS_FIELD_NUMBER, 14}, m = "executeOnBackground", v = 2)
public final class SearchTopValuesUseCase$executeOnBackground$1 extends u02 {
    public String t;
    public /* synthetic */ Object u;
    public final /* synthetic */ SearchTopValuesUseCase v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchTopValuesUseCase$executeOnBackground$1(SearchTopValuesUseCase searchTopValuesUseCase, u02 u02Var) {
        super(u02Var);
        this.v = searchTopValuesUseCase;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
