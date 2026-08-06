package io.intercom.android.sdk.m5.conversation.ui.components;

import defpackage.aa0;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.h37;
import defpackage.hy5;
import defpackage.mh4;
import defpackage.nz5;
import defpackage.oz8;
import defpackage.p6a;
import defpackage.r02;
import defpackage.r54;
import defpackage.s54;
import defpackage.t72;
import defpackage.th1;
import defpackage.u02;
import defpackage.v72;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yk2;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1", f = "LazyMessageList.kt", l = {144}, m = "invokeSuspend")
public final class LazyMessageListKt$LazyMessageList$13$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ h37<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ nz5 $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyMessageListKt$LazyMessageList$13$1(nz5 nz5Var, h37<Boolean> h37Var, r02<? super LazyMessageListKt$LazyMessageList$13$1> r02Var) {
        super(2, r02Var);
        this.$lazyListState = nz5Var;
        this.$isListAtTheBottom$delegate = h37Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(nz5 nz5Var) {
        return nz5Var.j().g();
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new LazyMessageListKt$LazyMessageList$13$1(this.$lazyListState, this.$isListAtTheBottom$delegate, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((LazyMessageListKt$LazyMessageList$13$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            final nz5 nz5Var = this.$lazyListState;
            final oz8 oz8VarK = bl7.k(new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.k
                @Override // defpackage.mh4
                public final Object invoke() {
                    return LazyMessageListKt$LazyMessageList$13$1.invokeSuspend$lambda$0(nz5Var);
                }
            });
            r54<Boolean> r54Var = new r54<Boolean>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class AnonymousClass2<T> implements s54 {
                    final /* synthetic */ s54 $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$invokeSuspend$$inlined$map$1$2", f = "LazyMessageList.kt", l = {50}, m = "emit")
                    public static final class AnonymousClass1 extends u02 {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(r02 r02Var) {
                            super(r02Var);
                        }

                        @Override // defpackage.ak0
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(s54 s54Var) {
                        this.$this_unsafeFlow = s54Var;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // defpackage.s54
                    public final Object emit(Object obj, r02 r02Var) throws Throwable {
                        AnonymousClass1 anonymousClass1;
                        if (r02Var instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) r02Var;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(r02Var);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(r02Var);
                        }
                        Object obj2 = anonymousClass1.result;
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            dv8.b(obj2);
                            s54 s54Var = this.$this_unsafeFlow;
                            hy5 hy5Var = (hy5) th1.H((List) obj);
                            Boolean boolValueOf = Boolean.valueOf(xj5.a(hy5Var != null ? hy5Var.getKey() : null, ConversationUiStateKt.LastAnchorRowKey));
                            anonymousClass1.label = 1;
                            Object objEmit = s54Var.emit(boolValueOf, anonymousClass1);
                            v72 v72Var = v72.t;
                            if (objEmit == v72Var) {
                                return v72Var;
                            }
                        } else {
                            if (i2 != 1) {
                                aa0.c("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            dv8.b(obj2);
                        }
                        return g2b.a;
                    }
                }

                @Override // defpackage.r54
                public Object collect(s54<? super Boolean> s54Var, r02 r02Var) {
                    Object objCollect = oz8VarK.collect(new AnonymousClass2(s54Var), r02Var);
                    return objCollect == v72.t ? objCollect : g2b.a;
                }
            };
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$isListAtTheBottom$delegate, null);
            this.label = 1;
            Object objF = yk2.f(r54Var, anonymousClass3, this);
            v72 v72Var = v72.t;
            if (objF == v72Var) {
                return v72Var;
            }
        } else {
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
        }
        return g2b.a;
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$13$1$3", f = "LazyMessageList.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends p6a implements ci4<Boolean, r02<? super g2b>, Object> {
        final /* synthetic */ h37<Boolean> $isListAtTheBottom$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(h37<Boolean> h37Var, r02<? super AnonymousClass3> r02Var) {
            super(2, r02Var);
            this.$isListAtTheBottom$delegate = h37Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$isListAtTheBottom$delegate, r02Var);
            anonymousClass3.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass3;
        }

        public final Object invoke(boolean z, r02<? super g2b> r02Var) {
            return ((AnonymousClass3) create(Boolean.valueOf(z), r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            LazyMessageListKt.LazyMessageList$lambda$28(this.$isListAtTheBottom$delegate, this.Z$0);
            return g2b.a;
        }

        @Override // defpackage.ci4
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, r02<? super g2b> r02Var) {
            return invoke(bool.booleanValue(), r02Var);
        }
    }
}
