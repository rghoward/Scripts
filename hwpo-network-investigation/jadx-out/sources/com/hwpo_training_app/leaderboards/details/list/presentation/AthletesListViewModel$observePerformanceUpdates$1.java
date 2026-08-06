package com.hwpo_training_app.leaderboards.details.list.presentation;

import defpackage.ci4;
import defpackage.dv8;
import defpackage.ec6;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.xd3;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.leaderboards.details.list.presentation.AthletesListViewModel$observePerformanceUpdates$1", f = "AthletesListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
final class AthletesListViewModel$observePerformanceUpdates$1 extends p6a implements ci4<xd3<? extends Exception, ? extends g2b>, r02<? super g2b>, Object> {
    public final /* synthetic */ AthletesListViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AthletesListViewModel$observePerformanceUpdates$1(AthletesListViewModel athletesListViewModel, r02<? super AthletesListViewModel$observePerformanceUpdates$1> r02Var) {
        super(2, r02Var);
        this.t = athletesListViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new AthletesListViewModel$observePerformanceUpdates$1(this.t, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends g2b> xd3Var, r02<? super g2b> r02Var) {
        return ((AthletesListViewModel$observePerformanceUpdates$1) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        dv8.b(obj);
        this.t.i(ec6.v);
        return g2b.a;
    }
}
