package io.intercom.android.sdk.m5.preview.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import defpackage.aa0;
import defpackage.anb;
import defpackage.bl7;
import defpackage.bnb;
import defpackage.ci4;
import defpackage.dnb;
import defpackage.dq1;
import defpackage.dv8;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.hf3;
import defpackage.i76;
import defpackage.ia3;
import defpackage.iq1;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.qq2;
import defpackage.r02;
import defpackage.ss5;
import defpackage.t72;
import defpackage.th1;
import defpackage.ty0;
import defpackage.u;
import defpackage.v72;
import defpackage.x10;
import defpackage.xm2;
import defpackage.yv9;
import defpackage.z2a;
import defpackage.zmb;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewArgs;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.m5.preview.model.PreviewUiState;
import io.intercom.android.sdk.m5.preview.ui.IntercomPreviewActivity;
import io.intercom.android.sdk.m5.preview.util.PdfUtilsKt;
import io.intercom.android.sdk.m5.preview.viewmodel.PreviewViewModel;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomPreviewActivity extends dq1 {
    private final ss5 viewModel$delegate = new o7a(new mh4() { // from class: ei5
        @Override // defpackage.mh4
        public final Object invoke() {
            return IntercomPreviewActivity.viewModel_delegate$lambda$0(this.t);
        }
    });
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.ui.IntercomPreviewActivity$checkAndHandlePdfBrowserFallback$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.m5.preview.ui.IntercomPreviewActivity$checkAndHandlePdfBrowserFallback$1", f = "IntercomPreviewActivity.kt", l = {87}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ IntercomPreviewFile $file;
        int label;
        final /* synthetic */ IntercomPreviewActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(IntercomPreviewFile intercomPreviewFile, IntercomPreviewActivity intercomPreviewActivity, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$file = intercomPreviewFile;
            this.this$0 = intercomPreviewActivity;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new AnonymousClass1(this.$file, this.this$0, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((AnonymousClass1) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:20:0x0046  */
        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean zBooleanValue;
            IntercomPreviewActivity intercomPreviewActivity;
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                IntercomPreviewFile intercomPreviewFile = this.$file;
                if (intercomPreviewFile instanceof IntercomPreviewFile.LocalFile) {
                    zBooleanValue = false;
                } else {
                    if (!(intercomPreviewFile instanceof IntercomPreviewFile.NetworkFile)) {
                        u.b();
                        return null;
                    }
                    IntercomPreviewActivity intercomPreviewActivity2 = this.this$0;
                    this.label = 1;
                    obj = PdfUtilsKt.shouldOpenPdfInBrowser(intercomPreviewActivity2, intercomPreviewFile, this);
                    v72 v72Var = v72.t;
                    if (obj == v72Var) {
                        return v72Var;
                    }
                }
                intercomPreviewActivity = this.this$0;
                if (zBooleanValue) {
                    intercomPreviewActivity.openPdfInBrowser(this.$file);
                    this.this$0.finishWithResult(0, hf3.t);
                } else {
                    intercomPreviewActivity.setupPreviewUI();
                }
                return g2b.a;
            }
            if (i != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            intercomPreviewActivity = this.this$0;
            if (zBooleanValue) {
                intercomPreviewActivity.openPdfInBrowser(this.$file);
                this.this$0.finishWithResult(0, hf3.t);
            } else {
                intercomPreviewActivity.setupPreviewUI();
            }
            return g2b.a;
        }
    }

    private final void checkAndHandlePdfBrowserFallback(IntercomPreviewFile intercomPreviewFile) {
        oy0.d(i76.a(getLifecycle()), null, null, new AnonymousClass1(intercomPreviewFile, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithResult(int i, List<? extends Uri> list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("MEDIA_RESULT_URIS", new ArrayList<>(list));
        setResult(i, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntercomPreviewArgs getPreviewData() {
        IntercomPreviewArgs intercomPreviewArgs;
        Bundle extras = getIntent().getExtras();
        return (extras == null || (intercomPreviewArgs = (IntercomPreviewArgs) ty0.a(extras, "INTERCOM_PREVIEW_ARGS", IntercomPreviewArgs.class)) == null) ? new IntercomPreviewArgs(null, null, null, false, 0, null, 63, null) : intercomPreviewArgs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PreviewViewModel getViewModel() {
        return (PreviewViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openPdfInBrowser(IntercomPreviewFile intercomPreviewFile) {
        Uri uri = intercomPreviewFile.getUri();
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setFlags(268435457);
            if (Build.VERSION.SDK_INT >= 30) {
                intent.addCategory("android.intent.category.BROWSABLE");
            }
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            Log.e("IntercomPreview", "No Activity found to handle the PDF file: " + uri, e);
        } catch (SecurityException e2) {
            Log.e("IntercomPreview", "Couldn't open PDF file because of security error: " + e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupPreviewUI() {
        x10 anbVar;
        ia3.b(this);
        Window window = getWindow();
        yv9 yv9Var = new yv9(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            anbVar = new dnb(window, yv9Var);
        } else if (i >= 30) {
            anbVar = new bnb(window, yv9Var);
        } else {
            anbVar = i >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
        }
        anbVar.h(false);
        iq1.a(this, new fr1(true, -2127503266, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.m5.preview.ui.IntercomPreviewActivity.setupPreviewUI.1
            /* JADX WARN: Multi-variable type inference failed */
            public final void invoke(jt1 jt1Var, int i2) {
                if ((i2 & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                if (((PreviewUiState) bl7.c(IntercomPreviewActivity.this.getViewModel().getState$intercom_sdk_base_release(), jt1Var, 0).getValue()).getFiles().isEmpty()) {
                    IntercomPreviewActivity.this.finishWithResult(0, hf3.t);
                }
                IntercomThemeKt.IntercomTheme(null, null, null, gr1.b(1919074696, new C01611(IntercomPreviewActivity.this), jt1Var), jt1Var, 3072, 7);
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }

            /* JADX INFO: renamed from: io.intercom.android.sdk.m5.preview.ui.IntercomPreviewActivity$setupPreviewUI$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class C01611 implements ci4<jt1, Integer, g2b> {
                final /* synthetic */ IntercomPreviewActivity this$0;

                public C01611(IntercomPreviewActivity intercomPreviewActivity) {
                    this.this$0 = intercomPreviewActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final g2b invoke$lambda$1$lambda$0(IntercomPreviewActivity intercomPreviewActivity, List list) {
                    list.getClass();
                    intercomPreviewActivity.finishWithResult(-1, list);
                    return g2b.a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final g2b invoke$lambda$3$lambda$2(IntercomPreviewActivity intercomPreviewActivity, IntercomPreviewFile intercomPreviewFile) {
                    intercomPreviewFile.getClass();
                    intercomPreviewActivity.getViewModel().onDeleteClicked$intercom_sdk_base_release(intercomPreviewFile);
                    return g2b.a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final g2b invoke$lambda$5$lambda$4(IntercomPreviewActivity intercomPreviewActivity, List list) {
                    list.getClass();
                    intercomPreviewActivity.finishWithResult(-1, list);
                    return g2b.a;
                }

                public final void invoke(jt1 jt1Var, int i) {
                    if ((i & 3) == 2 && jt1Var.r()) {
                        jt1Var.u();
                        return;
                    }
                    IntercomPreviewArgs previewData = this.this$0.getPreviewData();
                    PreviewViewModel viewModel = this.this$0.getViewModel();
                    jt1Var.K(455873972);
                    boolean zJ = jt1Var.j(this.this$0);
                    final IntercomPreviewActivity intercomPreviewActivity = this.this$0;
                    Object objF = jt1Var.f();
                    jt1.a.C0187a c0187a = jt1.a.a;
                    if (zJ || objF == c0187a) {
                        objF = new oh4() { // from class: io.intercom.android.sdk.m5.preview.ui.e
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return IntercomPreviewActivity.C03811.C01611.invoke$lambda$1$lambda$0(intercomPreviewActivity, (List) obj);
                            }
                        };
                        jt1Var.C(objF);
                    }
                    oh4 oh4Var = (oh4) objF;
                    jt1Var.B();
                    jt1Var.K(455878024);
                    boolean zJ2 = jt1Var.j(this.this$0);
                    final IntercomPreviewActivity intercomPreviewActivity2 = this.this$0;
                    Object objF2 = jt1Var.f();
                    if (zJ2 || objF2 == c0187a) {
                        objF2 = new oh4() { // from class: io.intercom.android.sdk.m5.preview.ui.f
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return IntercomPreviewActivity.C03811.C01611.invoke$lambda$3$lambda$2(intercomPreviewActivity2, (IntercomPreviewFile) obj);
                            }
                        };
                        jt1Var.C(objF2);
                    }
                    oh4 oh4Var2 = (oh4) objF2;
                    jt1Var.B();
                    jt1Var.K(455881652);
                    boolean zJ3 = jt1Var.j(this.this$0);
                    final IntercomPreviewActivity intercomPreviewActivity3 = this.this$0;
                    Object objF3 = jt1Var.f();
                    if (zJ3 || objF3 == c0187a) {
                        objF3 = new oh4() { // from class: io.intercom.android.sdk.m5.preview.ui.g
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return IntercomPreviewActivity.C03811.C01611.invoke$lambda$5$lambda$4(intercomPreviewActivity3, (List) obj);
                            }
                        };
                        jt1Var.C(objF3);
                    }
                    jt1Var.B();
                    PreviewRootScreenKt.PreviewRootScreen(null, previewData, viewModel, oh4Var, oh4Var2, (oh4) objF3, jt1Var, 0, 1);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                    invoke(jt1Var, num.intValue());
                    return g2b.a;
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreviewViewModel viewModel_delegate$lambda$0(IntercomPreviewActivity intercomPreviewActivity) {
        return PreviewViewModel.Companion.create$intercom_sdk_base_release(intercomPreviewActivity, intercomPreviewActivity.getPreviewData());
    }

    @Override // defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IntercomPreviewArgs previewData = getPreviewData();
        if (previewData.getUris().size() == 1) {
            IntercomPreviewFile intercomPreviewFile = (IntercomPreviewFile) th1.y(previewData.getUris());
            if (z2a.o(intercomPreviewFile.getMimeType(this), "pdf", true)) {
                checkAndHandlePdfBrowserFallback(intercomPreviewFile);
                return;
            }
        }
        setupPreviewUI();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final Intent createIntent(Context context, IntercomPreviewArgs intercomPreviewArgs, int i) {
            context.getClass();
            intercomPreviewArgs.getClass();
            Intent intent = new Intent(context, (Class<?>) IntercomPreviewActivity.class);
            intent.putExtra("INTERCOM_PREVIEW_ARGS", IntercomPreviewArgs.copy$default(intercomPreviewArgs, null, null, null, false, i, null, 47, null));
            return intent;
        }

        private Companion() {
        }

        public final Intent createIntent(Context context, IntercomPreviewArgs intercomPreviewArgs) {
            context.getClass();
            intercomPreviewArgs.getClass();
            Intent intent = new Intent(context, (Class<?>) IntercomPreviewActivity.class);
            intent.putExtra("INTERCOM_PREVIEW_ARGS", intercomPreviewArgs);
            return intent;
        }
    }
}
