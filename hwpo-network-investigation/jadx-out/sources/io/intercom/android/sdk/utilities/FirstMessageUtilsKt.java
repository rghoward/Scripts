package io.intercom.android.sdk.utilities;

import android.content.Context;
import android.widget.Toast;
import com.intercom.twig.Twig;
import defpackage.aa0;
import defpackage.ag6;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.et2;
import defpackage.g2b;
import defpackage.ht4;
import defpackage.i23;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.r02;
import defpackage.r54;
import defpackage.s54;
import defpackage.t72;
import defpackage.u02;
import defpackage.v72;
import defpackage.xm2;
import defpackage.zl9;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirstMessageUtilsKt {
    public static final void handleFirstMessageToast(t72 t72Var, Twig twig, Context context, IntercomDataLayer intercomDataLayer) {
        t72Var.getClass();
        twig.getClass();
        context.getClass();
        intercomDataLayer.getClass();
        oy0.d(t72Var, null, null, new AnonymousClass1(intercomDataLayer, twig, context, null), 3);
    }

    public static final void showFirstMessageToast(Context context) {
        context.getClass();
        Toast.makeText(context, context.getString(R.string.intercom_android_activated_message), 1).show();
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1", f = "FirstMessageUtils.kt", l = {24}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ IntercomDataLayer $dataLayer;
        final /* synthetic */ Twig $twig;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IntercomDataLayer intercomDataLayer, Twig twig, Context context, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$dataLayer = intercomDataLayer;
            this.$twig = twig;
            this.$context = context;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new AnonymousClass1(this.$dataLayer, this.$twig, this.$context, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                final zl9<IntercomEvent> event = this.$dataLayer.getEvent();
                r54<Object> r54Var = new r54<Object>() { // from class: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class AnonymousClass2<T> implements s54 {
                        final /* synthetic */ s54 $this_unsafeFlow;

                        /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        @xm2(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "FirstMessageUtils.kt", l = {50}, m = "emit")
                        public static final class AnonymousClass1 extends u02 {
                            Object L$0;
                            Object L$1;
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
                                if (obj instanceof IntercomEvent.BaseResponseReceived) {
                                    anonymousClass1.label = 1;
                                    Object objEmit = s54Var.emit(obj, anonymousClass1);
                                    v72 v72Var = v72.t;
                                    if (objEmit == v72Var) {
                                        return v72Var;
                                    }
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
                    public Object collect(s54<? super Object> s54Var, r02 r02Var) {
                        Object objCollect = event.collect(new AnonymousClass2(s54Var), r02Var);
                        return objCollect == v72.t ? objCollect : g2b.a;
                    }
                };
                C01771 c01771 = new C01771(this.$twig, this.$context);
                this.label = 1;
                Object objCollect = r54Var.collect(c01771, this);
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
            return g2b.a;
        }

        /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class C01771<T> implements s54 {
            final /* synthetic */ Context $context;
            final /* synthetic */ Twig $twig;

            /* JADX INFO: renamed from: io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            @xm2(c = "io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1$1", f = "FirstMessageUtils.kt", l = {}, m = "invokeSuspend")
            public static final class C01781 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
                final /* synthetic */ Context $context;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01781(Context context, r02<? super C01781> r02Var) {
                    super(2, r02Var);
                    this.$context = context;
                }

                @Override // defpackage.ak0
                public final r02<g2b> create(Object obj, r02<?> r02Var) {
                    return new C01781(this.$context, r02Var);
                }

                @Override // defpackage.ci4
                public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                    return ((C01781) create(t72Var, r02Var)).invokeSuspend(g2b.a);
                }

                @Override // defpackage.ak0
                public final Object invokeSuspend(Object obj) throws Throwable {
                    if (this.label != 0) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj);
                    FirstMessageUtilsKt.showFirstMessageToast(this.$context);
                    return g2b.a;
                }
            }

            public C01771(Twig twig, Context context) {
                this.$twig = twig;
                this.$context = context;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1, io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1<T>, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v1, types: [io.intercom.android.sdk.utilities.FirstMessageUtilsKt$handleFirstMessageToast$1$1] */
            /* JADX WARN: Type inference failed for: r4v10 */
            /* JADX WARN: Type inference failed for: r4v11 */
            /* JADX WARN: Type inference failed for: r4v5 */
            public final Object emit(IntercomEvent.BaseResponseReceived baseResponseReceived, r02<? super g2b> r02Var) throws Throwable {
                FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1;
                if (r02Var instanceof FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) {
                    firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = (FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1) r02Var;
                    int i = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = new FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1(this, r02Var);
                    }
                } else {
                    firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1 = new FirstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1(this, r02Var);
                }
                Object obj = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.result;
                int i2 = firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label;
                try {
                    if (i2 == 0) {
                        dv8.b(obj);
                        if (baseResponseReceived.getBaseResponse().getConfig().isFirstRequest()) {
                            this.$twig.i(this.$context.getString(R.string.intercom_android_activated_message), new Object[0]);
                            et2 et2Var = i23.a;
                            ht4 ht4Var = ag6.a;
                            C01781 c01781 = new C01781(this.$context, null);
                            firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.L$0 = this;
                            firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.label = 1;
                            Object objG = oy0.g(ht4Var, c01781, firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1);
                            v72 v72Var = v72.t;
                            this = objG;
                            if (objG == v72Var) {
                                return v72Var;
                            }
                        }
                        return g2b.a;
                    }
                    if (i2 != 1) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z = (C01771<T>) ((C01771) firstMessageUtilsKt$handleFirstMessageToast$1$1$emit$1.L$0);
                    dv8.b(obj);
                    this = z;
                } catch (Exception e) {
                    this.$twig.internal("Couldn't show first message toast: " + e.getMessage());
                }
                return g2b.a;
            }

            @Override // defpackage.s54
            public /* bridge */ /* synthetic */ Object emit(Object obj, r02 r02Var) {
                return emit((IntercomEvent.BaseResponseReceived) obj, (r02<? super g2b>) r02Var);
            }
        }
    }
}
