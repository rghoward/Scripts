package io.intercom.android.sdk.m5.data;

import defpackage.aa0;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.fl;
import defpackage.g2b;
import defpackage.p6a;
import defpackage.r02;
import defpackage.s54;
import defpackage.t72;
import defpackage.v72;
import defpackage.xm2;
import defpackage.zz9;
import io.intercom.android.sdk.UnreadConversationCountListener;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.data.UnreadCountTracker$addListener$job$1", f = "UnreadCountTracker.kt", l = {22}, m = "invokeSuspend")
public final class UnreadCountTracker$addListener$job$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ UnreadConversationCountListener $listener;
    int label;
    final /* synthetic */ UnreadCountTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadCountTracker$addListener$job$1(UnreadCountTracker unreadCountTracker, UnreadConversationCountListener unreadConversationCountListener, r02<? super UnreadCountTracker$addListener$job$1> r02Var) {
        super(2, r02Var);
        this.this$0 = unreadCountTracker;
        this.$listener = unreadConversationCountListener;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new UnreadCountTracker$addListener$job$1(this.this$0, this.$listener, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((UnreadCountTracker$addListener$job$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            zz9<Set<String>> unreadConversationIds = this.this$0.getDataLayer().getUnreadConversationIds();
            final UnreadConversationCountListener unreadConversationCountListener = this.$listener;
            s54<? super Set<String>> s54Var = new s54() { // from class: io.intercom.android.sdk.m5.data.UnreadCountTracker$addListener$job$1.1
                public final Object emit(Set<String> set, r02<? super g2b> r02Var) {
                    unreadConversationCountListener.onCountUpdate(set.size());
                    return g2b.a;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit((Set<String>) obj2, (r02<? super g2b>) r02Var);
                }
            };
            this.label = 1;
            Object objCollect = unreadConversationIds.collect(s54Var, this);
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
