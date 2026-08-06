package io.intercom.android.sdk.m5.home;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.models.OpenMessengerResponse;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.home.HomeViewModel$fetchHomeData$1$openDeferred$1", f = "HomeViewModel.kt", l = {122}, m = "invokeSuspend")
public final class HomeViewModel$fetchHomeData$1$openDeferred$1 extends p6a implements ci4<t72, r02<? super NetworkResponse<? extends OpenMessengerResponse>>, Object> {
    int label;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$fetchHomeData$1$openDeferred$1(HomeViewModel homeViewModel, r02<? super HomeViewModel$fetchHomeData$1$openDeferred$1> r02Var) {
        super(2, r02Var);
        this.this$0 = homeViewModel;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new HomeViewModel$fetchHomeData$1$openDeferred$1(this.this$0, r02Var);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(t72 t72Var, r02<? super NetworkResponse<OpenMessengerResponse>> r02Var) {
        return ((HomeViewModel$fetchHomeData$1$openDeferred$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                dv8.b(obj);
                return obj;
            }
            aa0.c("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dv8.b(obj);
        CommonRepository commonRepository = this.this$0.commonRepository;
        this.label = 1;
        Object objOpenMessenger = commonRepository.openMessenger(this);
        v72 v72Var = v72.t;
        return objOpenMessenger == v72Var ? v72Var : objOpenMessenger;
    }

    @Override // defpackage.ci4
    public /* bridge */ /* synthetic */ Object invoke(t72 t72Var, r02<? super NetworkResponse<? extends OpenMessengerResponse>> r02Var) {
        return invoke2(t72Var, (r02<? super NetworkResponse<OpenMessengerResponse>>) r02Var);
    }
}
