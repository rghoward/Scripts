package com.hwpo_training_app.notifications.domain;

import defpackage.u02;
import defpackage.xm2;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.notifications.domain.FetchNotificationsUseCase", f = "FetchNotificationsUseCase.kt", l = {10}, m = "executeOnBackground", v = 2)
final class FetchNotificationsUseCase$executeOnBackground$1 extends u02 {
    public /* synthetic */ Object t;
    public final /* synthetic */ FetchNotificationsUseCase u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchNotificationsUseCase$executeOnBackground$1(FetchNotificationsUseCase fetchNotificationsUseCase, u02 u02Var) {
        super(u02Var);
        this.u = fetchNotificationsUseCase;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.a(null, this);
    }
}
