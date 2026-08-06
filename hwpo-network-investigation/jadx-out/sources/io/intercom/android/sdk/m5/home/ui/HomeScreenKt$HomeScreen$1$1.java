package io.intercom.android.sdk.m5.home.ui;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.fl;
import defpackage.g2b;
import defpackage.mh4;
import defpackage.oh4;
import defpackage.p6a;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.u;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.zl9;
import io.intercom.android.sdk.m5.home.HomeViewModel;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1$1", f = "HomeScreen.kt", l = {82}, m = "invokeSuspend")
public final class HomeScreenKt$HomeScreen$1$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ HomeViewModel $homeViewModel;
    final /* synthetic */ oh4<String, g2b> $navigateToExistingConversation;
    final /* synthetic */ mh4<g2b> $navigateToMessages;
    final /* synthetic */ mh4<g2b> $navigateToNewConversation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeScreenKt$HomeScreen$1$1(HomeViewModel homeViewModel, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, oh4<? super String, g2b> oh4Var, r02<? super HomeScreenKt$HomeScreen$1$1> r02Var) {
        super(2, r02Var);
        this.$homeViewModel = homeViewModel;
        this.$navigateToMessages = mh4Var;
        this.$navigateToNewConversation = mh4Var2;
        this.$navigateToExistingConversation = oh4Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new HomeScreenKt$HomeScreen$1$1(this.$homeViewModel, this.$navigateToMessages, this.$navigateToNewConversation, this.$navigateToExistingConversation, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((HomeScreenKt$HomeScreen$1$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            zl9<HomeUiEffects> effect = this.$homeViewModel.getEffect();
            final mh4<g2b> mh4Var = this.$navigateToMessages;
            final mh4<g2b> mh4Var2 = this.$navigateToNewConversation;
            final oh4<String, g2b> oh4Var = this.$navigateToExistingConversation;
            s54<? super HomeUiEffects> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$1$1.1
                public final Object emit(HomeUiEffects homeUiEffects, r02<? super g2b> r02Var) {
                    if (xj5.a(homeUiEffects, HomeUiEffects.NavigateToMessages.INSTANCE)) {
                        mh4Var.invoke();
                    } else if (xj5.a(homeUiEffects, HomeUiEffects.NavigateToNewConversation.INSTANCE)) {
                        mh4Var2.invoke();
                    } else {
                        if (!(homeUiEffects instanceof HomeUiEffects.NavigateToConversation)) {
                            u.b();
                            return null;
                        }
                        oh4Var.invoke(((HomeUiEffects.NavigateToConversation) homeUiEffects).getConversationId());
                    }
                    return g2b.a;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit((HomeUiEffects) obj2, (r02<? super g2b>) r02Var);
                }
            };
            this.label = 1;
            Object objCollect = effect.collect(s54Var, this);
            v72 v72Var = v72.t;
            if (objCollect == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        fl.a();
        return null;
    }
}
