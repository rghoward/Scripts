package io.intercom.android.sdk.survey.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import defpackage.aa0;
import defpackage.anb;
import defpackage.bl7;
import defpackage.bnb;
import defpackage.ci4;
import defpackage.dnb;
import defpackage.dv8;
import defpackage.f37;
import defpackage.fl;
import defpackage.fr1;
import defpackage.g2b;
import defpackage.gr1;
import defpackage.h37;
import defpackage.i76;
import defpackage.ia3;
import defpackage.iq1;
import defpackage.jt1;
import defpackage.mh4;
import defpackage.ni5;
import defpackage.o7a;
import defpackage.oh4;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.qq2;
import defpackage.r02;
import defpackage.s54;
import defpackage.ss5;
import defpackage.t72;
import defpackage.u;
import defpackage.v72;
import defpackage.vg7;
import defpackage.x10;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yn5;
import defpackage.yv9;
import defpackage.zmb;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.IntercomBaseActivity;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.ConfigurableIntercomThemeKt;
import io.intercom.android.sdk.survey.CloseEventTrigger;
import io.intercom.android.sdk.survey.SurveyEffects;
import io.intercom.android.sdk.survey.SurveyLaunchMode;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModel;
import io.intercom.android.sdk.survey.ui.components.SurveyComponentKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.LinkOpener;
import io.intercom.android.sdk.utilities.PhoneNumberValidator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class IntercomSurveyActivity extends IntercomBaseActivity {
    private static final String PARCEL_SURVEY_ID = "parcel_survey_id";
    private final Injector injector = Injector.get();
    private final ss5 viewModel$delegate = new o7a(new ni5(0, this));
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onStart$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onStart$1", f = "IntercomSurveyActivity.kt", l = {87}, m = "invokeSuspend")
    public static final class C04001 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C04001(r02<? super C04001> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return IntercomSurveyActivity.this.new C04001(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C04001) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                f37<SurveyEffects> effects = IntercomSurveyActivity.this.getViewModel().getEffects();
                final IntercomSurveyActivity intercomSurveyActivity = IntercomSurveyActivity.this;
                s54<? super SurveyEffects> s54Var = new s54() { // from class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity.onStart.1.1
                    public final Object emit(SurveyEffects surveyEffects, r02<? super g2b> r02Var) {
                        if (xj5.a(surveyEffects, SurveyEffects.ExitSurvey.INSTANCE)) {
                            intercomSurveyActivity.finish();
                            return g2b.a;
                        }
                        u.b();
                        return null;
                    }

                    @Override // defpackage.s54
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, r02 r02Var) {
                        return emit((SurveyEffects) obj2, (r02<? super g2b>) r02Var);
                    }
                };
                this.label = 1;
                Object objCollect = effects.collect(s54Var, this);
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

    public static final Intent buildIntent(Context context) {
        return Companion.buildIntent(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SurveyViewModel createVM() {
        String stringExtra = getIntent().getStringExtra(PARCEL_SURVEY_ID);
        return SurveyViewModel.Companion.create(this, stringExtra != null ? new SurveyLaunchMode.Programmatic(stringExtra) : new SurveyLaunchMode.Automatic(this.injector.getDataLayer().getSurveyData().getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SurveyViewModel getViewModel() {
        return (SurveyViewModel) this.viewModel$delegate.getValue();
    }

    @Override // io.intercom.android.sdk.activities.IntercomBaseActivity, androidx.fragment.app.g, defpackage.dq1, defpackage.hq1, android.app.Activity
    public void onCreate(Bundle bundle) {
        ia3.b(this);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().b(new vg7() { // from class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity.onCreate.1
            @Override // defpackage.vg7
            public void handleOnBackPressed() {
            }
        });
        PhoneNumberValidator.loadCountryAreaCodes(this);
        iq1.a(this, new fr1(true, -179321000, new ci4<jt1, Integer, g2b>() { // from class: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity.onCreate.2
            public final void invoke(jt1 jt1Var, int i) {
                if ((i & 3) == 2 && jt1Var.r()) {
                    jt1Var.u();
                    return;
                }
                AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                appConfig.getClass();
                ConfigurableIntercomThemeKt.ConfigurableIntercomTheme(appConfig, gr1.b(-2107771943, new AnonymousClass1(IntercomSurveyActivity.this), jt1Var), jt1Var, 48);
            }

            @Override // defpackage.ci4
            public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                invoke(jt1Var, num.intValue());
                return g2b.a;
            }

            /* JADX INFO: renamed from: io.intercom.android.sdk.survey.ui.IntercomSurveyActivity$onCreate$2$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class AnonymousClass1 implements ci4<jt1, Integer, g2b> {
                final /* synthetic */ IntercomSurveyActivity this$0;

                public AnonymousClass1(IntercomSurveyActivity intercomSurveyActivity) {
                    this.this$0 = intercomSurveyActivity;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final g2b invoke$lambda$2$lambda$1(IntercomSurveyActivity intercomSurveyActivity) {
                    intercomSurveyActivity.getViewModel().onCloseClicked(CloseEventTrigger.CLOSE_BUTTON);
                    return g2b.a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final g2b invoke$lambda$4$lambda$3(IntercomSurveyActivity intercomSurveyActivity, String str) {
                    str.getClass();
                    intercomSurveyActivity.getViewModel().onAnswerUpdated();
                    return g2b.a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final g2b invoke$lambda$6$lambda$5(IntercomSurveyActivity intercomSurveyActivity, SurveyState.Content.SecondaryCta secondaryCta) {
                    secondaryCta.getClass();
                    intercomSurveyActivity.getViewModel().onSecondaryCtaClicked(secondaryCta);
                    LinkOpener.handleUrl(secondaryCta.getDestination(), intercomSurveyActivity, intercomSurveyActivity.injector.getApi());
                    return g2b.a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(jt1 jt1Var, int i) {
                    x10 anbVar;
                    if ((i & 3) == 2 && jt1Var.r()) {
                        jt1Var.u();
                        return;
                    }
                    h37 h37VarC = bl7.c(this.this$0.getViewModel().getState(), jt1Var, 0);
                    SurveyUiColors surveyUiColors = ((SurveyState) h37VarC.getValue()).getSurveyUiColors();
                    Window window = this.this$0.getWindow();
                    yv9 yv9Var = new yv9(this.this$0.getWindow().getDecorView());
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 35) {
                        anbVar = new dnb(window, yv9Var);
                    } else if (i2 >= 30) {
                        anbVar = new bnb(window, yv9Var);
                    } else {
                        anbVar = i2 >= 26 ? new anb(window, yv9Var) : new zmb(window, yv9Var);
                    }
                    anbVar.h(ColorExtensionsKt.m840isLightColor8_81llA(ColorExtensionsKt.m832darken8_81llA(surveyUiColors.m403getBackground0d7_KjU())));
                    SurveyState surveyState = (SurveyState) h37VarC.getValue();
                    SurveyViewModel viewModel = this.this$0.getViewModel();
                    jt1Var.K(1710823161);
                    boolean zJ = jt1Var.j(viewModel);
                    Object objF = jt1Var.f();
                    jt1.a.C0187a c0187a = jt1.a.a;
                    if (zJ || objF == c0187a) {
                        objF = new IntercomSurveyActivity$onCreate$2$1$1$1(viewModel);
                        jt1Var.C(objF);
                    }
                    jt1Var.B();
                    oh4 oh4Var = (oh4) ((yn5) objF);
                    jt1Var.K(1710825095);
                    boolean zJ2 = jt1Var.j(this.this$0);
                    final IntercomSurveyActivity intercomSurveyActivity = this.this$0;
                    Object objF2 = jt1Var.f();
                    if (zJ2 || objF2 == c0187a) {
                        objF2 = new mh4() { // from class: io.intercom.android.sdk.survey.ui.a
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return IntercomSurveyActivity.AnonymousClass2.AnonymousClass1.invoke$lambda$2$lambda$1(intercomSurveyActivity);
                            }
                        };
                        jt1Var.C(objF2);
                    }
                    mh4 mh4Var = (mh4) objF2;
                    jt1Var.B();
                    jt1Var.K(1710836350);
                    boolean zJ3 = jt1Var.j(this.this$0);
                    final IntercomSurveyActivity intercomSurveyActivity2 = this.this$0;
                    Object objF3 = jt1Var.f();
                    if (zJ3 || objF3 == c0187a) {
                        objF3 = new oh4() { // from class: io.intercom.android.sdk.survey.ui.b
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return IntercomSurveyActivity.AnonymousClass2.AnonymousClass1.invoke$lambda$4$lambda$3(intercomSurveyActivity2, (String) obj);
                            }
                        };
                        jt1Var.C(objF3);
                    }
                    oh4 oh4Var2 = (oh4) objF3;
                    jt1Var.B();
                    jt1Var.K(1710829955);
                    boolean zJ4 = jt1Var.j(this.this$0);
                    final IntercomSurveyActivity intercomSurveyActivity3 = this.this$0;
                    Object objF4 = jt1Var.f();
                    if (zJ4 || objF4 == c0187a) {
                        objF4 = new oh4() { // from class: io.intercom.android.sdk.survey.ui.c
                            @Override // defpackage.oh4
                            public final Object invoke(Object obj) {
                                return IntercomSurveyActivity.AnonymousClass2.AnonymousClass1.invoke$lambda$6$lambda$5(intercomSurveyActivity3, (SurveyState.Content.SecondaryCta) obj);
                            }
                        };
                        jt1Var.C(objF4);
                    }
                    jt1Var.B();
                    SurveyComponentKt.SurveyComponent(surveyState, oh4Var, mh4Var, oh4Var2, (oh4) objF4, jt1Var, 0, 0);
                }

                @Override // defpackage.ci4
                public /* bridge */ /* synthetic */ g2b invoke(jt1 jt1Var, Integer num) {
                    invoke(jt1Var, num.intValue());
                    return g2b.a;
                }
            }
        }));
    }

    @Override // defpackage.uy, androidx.fragment.app.g, android.app.Activity
    public void onStart() {
        super.onStart();
        oy0.d(i76.a(getLifecycle()), null, null, new C04001(null), 3);
        getViewModel().onUiLoaded();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public static /* synthetic */ Intent buildIntent$default(Companion companion, Context context, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.buildIntent(context, str);
        }

        public final Intent buildIntent(Context context, String str) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) IntercomSurveyActivity.class);
            intent.putExtra(IntercomSurveyActivity.PARCEL_SURVEY_ID, str);
            intent.setFlags(335544320);
            return intent;
        }

        private Companion() {
        }

        public final Intent buildIntent(Context context) {
            context.getClass();
            return buildIntent$default(this, context, null, 2, null);
        }
    }

    public static final Intent buildIntent(Context context, String str) {
        return Companion.buildIntent(context, str);
    }
}
