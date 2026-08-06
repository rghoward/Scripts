package io.intercom.android.sdk.m5.conversation.ui;

import defpackage.aa0;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.g2b;
import defpackage.h64;
import defpackage.mh4;
import defpackage.nz5;
import defpackage.oh4;
import defpackage.oz8;
import defpackage.p6a;
import defpackage.r02;
import defpackage.r54;
import defpackage.s54;
import defpackage.t72;
import defpackage.u02;
import defpackage.u54;
import defpackage.v72;
import defpackage.w54;
import defpackage.wx7;
import defpackage.xm2;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35$1", f = "ConversationScreen.kt", l = {541}, m = "invokeSuspend")
public final class ConversationScreenKt$ConversationScreenContent$35$1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isLargeFont;
    final /* synthetic */ float $lazyListJumpToBottomScrollOffset;
    final /* synthetic */ nz5 $lazyListState;
    final /* synthetic */ oh4<ConversationScrolledState, g2b> $onConversationScrolled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationScreenKt$ConversationScreenContent$35$1(nz5 nz5Var, float f, oh4<? super ConversationScrolledState, g2b> oh4Var, boolean z, boolean z2, r02<? super ConversationScreenKt$ConversationScreenContent$35$1> r02Var) {
        super(2, r02Var);
        this.$lazyListState = nz5Var;
        this.$lazyListJumpToBottomScrollOffset = f;
        this.$onConversationScrolled = oh4Var;
        this.$isLandscape = z;
        this.$isLargeFont = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(nz5 nz5Var) {
        return nz5Var.j().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$2(boolean z) {
        return z ? 200L : 0L;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new ConversationScreenKt$ConversationScreenContent$35$1(this.$lazyListState, this.$lazyListJumpToBottomScrollOffset, this.$onConversationScrolled, this.$isLandscape, this.$isLargeFont, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((ConversationScreenKt$ConversationScreenContent$35$1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            dv8.b(obj);
            final nz5 nz5Var = this.$lazyListState;
            final oz8 oz8VarK = bl7.k(new mh4() { // from class: io.intercom.android.sdk.m5.conversation.ui.c
                @Override // defpackage.mh4
                public final Object invoke() {
                    return ConversationScreenKt$ConversationScreenContent$35$1.invokeSuspend$lambda$0(nz5Var);
                }
            });
            final float f = this.$lazyListJumpToBottomScrollOffset;
            final nz5 nz5Var2 = this.$lazyListState;
            h64 h64Var = new h64(new d(), new r54<Boolean>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static final class AnonymousClass2<T> implements s54 {
                    final /* synthetic */ float $lazyListJumpToBottomScrollOffset$inlined;
                    final /* synthetic */ nz5 $lazyListState$inlined;
                    final /* synthetic */ s54 $this_unsafeFlow;

                    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @xm2(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35$1$invokeSuspend$$inlined$map$1$2", f = "ConversationScreen.kt", l = {50}, m = "emit")
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

                    public AnonymousClass2(s54 s54Var, float f, nz5 nz5Var) {
                        this.$this_unsafeFlow = s54Var;
                        this.$lazyListJumpToBottomScrollOffset$inlined = f;
                        this.$lazyListState$inlined = nz5Var;
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
                            Boolean boolValueOf = Boolean.valueOf(ConversationScreenKt.isLazyListScrolled((List) obj, this.$lazyListJumpToBottomScrollOffset$inlined, this.$lazyListState$inlined.j().e()));
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
                    Object objCollect = oz8VarK.collect(new AnonymousClass2(s54Var, f, nz5Var2), r02Var);
                    return objCollect == v72.t ? objCollect : g2b.a;
                }
            }, null);
            final oh4<ConversationScrolledState, g2b> oh4Var = this.$onConversationScrolled;
            final nz5 nz5Var3 = this.$lazyListState;
            final boolean z = this.$isLandscape;
            final boolean z2 = this.$isLargeFont;
            s54 s54Var = new s54() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$35$1.4
                public final Object emit(boolean z3, r02<? super g2b> r02Var) {
                    oh4<ConversationScrolledState, g2b> oh4Var2 = oh4Var;
                    int iE = nz5Var3.j().e() - 1;
                    if (iE < 0) {
                        iE = 0;
                    }
                    oh4Var2.invoke(new ConversationScrolledState(z3, z, z2, iE));
                    return g2b.a;
                }

                @Override // defpackage.s54
                public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                    return emit(((Boolean) obj2).booleanValue(), (r02<? super g2b>) r02Var);
                }
            };
            this.label = 1;
            w54 w54Var = new w54(h64Var, s54Var, null);
            u54 u54Var = new u54(this, getContext());
            Object objD = wx7.d(u54Var, true, u54Var, w54Var);
            Object obj2 = v72.t;
            if (objD != obj2) {
                objD = g2b.a;
            }
            if (objD == obj2) {
                return obj2;
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
}
