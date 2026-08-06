package io.intercom.android.sdk.survey;

import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.b0a;
import defpackage.ci4;
import defpackage.dn4;
import defpackage.dv8;
import defpackage.et2;
import defpackage.f37;
import defpackage.g2b;
import defpackage.i23;
import defpackage.i37;
import defpackage.lb2;
import defpackage.ll8;
import defpackage.mh4;
import defpackage.mhb;
import defpackage.n72;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.qq2;
import defpackage.r02;
import defpackage.rhb;
import defpackage.sd1;
import defpackage.t72;
import defpackage.th1;
import defpackage.thb;
import defpackage.ty1;
import defpackage.u;
import defpackage.u02;
import defpackage.uhb;
import defpackage.v72;
import defpackage.vhb;
import defpackage.whb;
import defpackage.wn5;
import defpackage.wr2;
import defpackage.wt4;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.z;
import defpackage.z2a;
import defpackage.z90;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.model.FetchSurveyRequest;
import io.intercom.android.sdk.survey.model.StatsCtaRequestModel;
import io.intercom.android.sdk.survey.model.SubmitSurveyRequestItem;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.model.SurveySenderAvatar;
import io.intercom.android.sdk.survey.model.SurveySenderData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyViewModel extends mhb {
    public static final int ENTITY_TYPE = 85;
    private final AppConfig appConfig;
    private final List<SubmitSurveyRequestItem> completedResponses;
    private final List<SurveyData.Step> completedSteps;
    private SurveyData.Step currentStep;
    private final n72 dispatcher;
    private final f37<SurveyEffects> effects;
    private final IntercomDataLayer intercomDataLayer;
    private final SurveyLaunchMode launchMode;
    private final MetricTracker metricTracker;
    private final i37<SurveyState> state;
    private SurveyData surveyData;
    private final SurveyRepository surveyRepository;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[SurveyData.StepType.values().length];
            try {
                iArr[SurveyData.StepType.QUESTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.StepType.INTRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.StepType.CONTENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.StepType.THANK_YOU.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CloseEventTrigger.values().length];
            try {
                iArr2[CloseEventTrigger.CTA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CloseEventTrigger.CLOSE_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CloseEventTrigger.SECONDARY_CTA_DEEP_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$fetchAndShowSurvey$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.survey.SurveyViewModel$fetchAndShowSurvey$1", f = "SurveyViewModel.kt", l = {142}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ String $surveyId;
        final /* synthetic */ SurveyUiColors $uiColors;
        int label;
        final /* synthetic */ SurveyViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, SurveyViewModel surveyViewModel, SurveyUiColors surveyUiColors, r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
            this.$surveyId = str;
            this.this$0 = surveyViewModel;
            this.$uiColors = surveyUiColors;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invokeSuspend$lambda$0(SurveyViewModel surveyViewModel, String str) {
            surveyViewModel.fetchAndShowSurvey(str);
            return g2b.a;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new AnonymousClass1(this.$surveyId, this.this$0, this.$uiColors, r02Var);
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
                boolean zW = z2a.w(this.$surveyId);
                SurveyViewModel surveyViewModel = this.this$0;
                if (zW) {
                    surveyViewModel.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
                    return g2b.a;
                }
                surveyViewModel.emitLoading();
                SurveyRepository surveyRepository = this.this$0.surveyRepository;
                String str = this.$surveyId;
                this.label = 1;
                obj = surveyRepository.fetchSurvey(str, this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            NetworkResponse networkResponse = (NetworkResponse) obj;
            if (networkResponse instanceof NetworkResponse.Success) {
                this.this$0.surveyData = ((FetchSurveyRequest) ((NetworkResponse.Success) networkResponse).getBody()).getSurvey();
                boolean zIsEmpty = this.this$0.surveyData.getSteps().isEmpty();
                SurveyViewModel surveyViewModel2 = this.this$0;
                if (zIsEmpty) {
                    surveyViewModel2.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
                } else {
                    surveyViewModel2.metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_PROGRAMMATIC, this.this$0.surveyData.getId(), this.this$0.surveyData.getFormatMetric());
                    SurveyData.Step step = (SurveyData.Step) th1.y(this.this$0.surveyData.getSteps());
                    this.this$0.currentStep = step;
                    i37<SurveyState> state = this.this$0.getState();
                    SurveyViewModel surveyViewModel3 = this.this$0;
                    state.setValue(surveyViewModel3.buildContentState(surveyViewModel3.surveyData, step));
                }
            } else if (networkResponse instanceof NetworkResponse.ClientError) {
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(0, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null), 1, null));
            } else if (networkResponse instanceof NetworkResponse.NetworkError) {
                i37<SurveyState> state2 = this.this$0.getState();
                TopBarState.NoTopBarState noTopBarState = new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null);
                SurveyUiColors surveyUiColors = this.$uiColors;
                final SurveyViewModel surveyViewModel4 = this.this$0;
                final String str2 = this.$surveyId;
                state2.setValue(new SurveyState.Error.WithCTA(0, surveyUiColors, noTopBarState, new mh4() { // from class: io.intercom.android.sdk.survey.a
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        return SurveyViewModel.AnonymousClass1.invokeSuspend$lambda$0(surveyViewModel4, str2);
                    }
                }, 1, null));
            } else {
                if (!(networkResponse instanceof NetworkResponse.ServerError)) {
                    u.b();
                    return null;
                }
                this.this$0.getState().setValue(new SurveyState.Error.WithoutCTA(R.string.intercom_page_not_found, this.$uiColors, new TopBarState.NoTopBarState(true, this.$uiColors, null, 4, null)));
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1", f = "SurveyViewModel.kt", l = {293}, m = "invokeSuspend")
    public static final class C03891 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ CloseEventTrigger $triggerType;
        int label;

        /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "io.intercom.android.sdk.survey.SurveyViewModel$onCloseClicked$1$1", f = "SurveyViewModel.kt", l = {277, 282}, m = "invokeSuspend")
        public static final class C01641 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            int label;
            final /* synthetic */ SurveyViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01641(SurveyViewModel surveyViewModel, r02<? super C01641> r02Var) {
                super(2, r02Var);
                this.this$0 = surveyViewModel;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C01641(this.this$0, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C01641) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0068  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
            
                if (r6.reportFailure(r0, r1, r5) == r4) goto L24;
             */
            @Override // defpackage.ak0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                /*
                    r5 = this;
                    int r0 = r5.label
                    r1 = 0
                    r2 = 2
                    r3 = 1
                    v72 r4 = defpackage.v72.t
                    if (r0 == 0) goto L1c
                    if (r0 == r3) goto L18
                    if (r0 != r2) goto L12
                    defpackage.dv8.b(r6)
                    goto L85
                L12:
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.aa0.c(r5)
                    return r1
                L18:
                    defpackage.dv8.b(r6)
                    goto L62
                L1c:
                    defpackage.dv8.b(r6)
                    io.intercom.android.sdk.survey.SurveyViewModel r6 = r5.this$0
                    io.intercom.android.sdk.survey.model.SurveyData r6 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r6)
                    java.util.List r6 = r6.getSteps()
                    boolean r6 = r6.isEmpty()
                    if (r6 != 0) goto L85
                    io.intercom.android.sdk.survey.SurveyViewModel r6 = r5.this$0
                    io.intercom.android.sdk.survey.model.SurveyData$Step r6 = io.intercom.android.sdk.survey.SurveyViewModel.access$getCurrentStep$p(r6)
                    if (r6 == 0) goto L3b
                    io.intercom.android.sdk.survey.model.SurveyData$StepType r1 = r6.getType()
                L3b:
                    io.intercom.android.sdk.survey.model.SurveyData$StepType r6 = io.intercom.android.sdk.survey.model.SurveyData.StepType.THANK_YOU
                    if (r1 == r6) goto L85
                    io.intercom.android.sdk.survey.SurveyViewModel r6 = r5.this$0
                    io.intercom.android.sdk.survey.SurveyRepository r6 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyRepository$p(r6)
                    io.intercom.android.sdk.survey.SurveyViewModel r0 = r5.this$0
                    io.intercom.android.sdk.survey.model.SurveyData r0 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r0)
                    java.lang.String r0 = r0.getId()
                    io.intercom.android.sdk.survey.SurveyViewModel r1 = r5.this$0
                    io.intercom.android.sdk.survey.model.SurveyData r1 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r1)
                    java.lang.String r1 = r1.getSurveyProgressId()
                    r5.label = r3
                    java.lang.Object r6 = r6.dismissSurvey(r0, r1, r5)
                    if (r6 != r4) goto L62
                    goto L84
                L62:
                    io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse r6 = (io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse) r6
                    boolean r6 = r6 instanceof io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse.ClientError
                    if (r6 == 0) goto L85
                    io.intercom.android.sdk.survey.SurveyViewModel r6 = r5.this$0
                    io.intercom.android.sdk.survey.model.SurveyData r0 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r6)
                    java.lang.String r0 = r0.getId()
                    io.intercom.android.sdk.survey.SurveyViewModel r1 = r5.this$0
                    io.intercom.android.sdk.survey.model.SurveyData r1 = io.intercom.android.sdk.survey.SurveyViewModel.access$getSurveyData$p(r1)
                    java.lang.String r1 = r1.getSurveyProgressId()
                    r5.label = r2
                    java.lang.Object r5 = io.intercom.android.sdk.survey.SurveyViewModel.access$reportFailure(r6, r0, r1, r5)
                    if (r5 != r4) goto L85
                L84:
                    return r4
                L85:
                    g2b r5 = defpackage.g2b.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.SurveyViewModel.C03891.C01641.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03891(CloseEventTrigger closeEventTrigger, r02<? super C03891> r02Var) {
            super(2, r02Var);
            this.$triggerType = closeEventTrigger;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return SurveyViewModel.this.new C03891(this.$triggerType, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03891) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                SurveyViewModel.this.sendDismissedEvent(this.$triggerType);
                oy0.d(dn4.t, null, null, new C01641(SurveyViewModel.this, null), 3);
                SurveyViewModel.this.intercomDataLayer.clearSurveyData();
                f37<SurveyEffects> effects = SurveyViewModel.this.getEffects();
                SurveyEffects.ExitSurvey exitSurvey = SurveyEffects.ExitSurvey.INSTANCE;
                this.label = 1;
                Object objEmit = effects.emit(exitSurvey, this);
                v72 v72Var = v72.t;
                if (objEmit == v72Var) {
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
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onSecondaryCtaClicked$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.survey.SurveyViewModel$onSecondaryCtaClicked$1", f = "SurveyViewModel.kt", l = {307}, m = "invokeSuspend")
    public static final class C03901 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ SurveyState.Content $content;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03901(SurveyState.Content content, r02<? super C03901> r02Var) {
            super(2, r02Var);
            this.$content = content;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return SurveyViewModel.this.new C03901(this.$content, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03901) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.label;
            if (i == 0) {
                dv8.b(obj);
                SurveyRepository surveyRepository = SurveyViewModel.this.surveyRepository;
                String id = SurveyViewModel.this.surveyData.getId();
                StatsCtaRequestModel statsCtaRequestModel = new StatsCtaRequestModel(SurveyViewModel.this.surveyData.getSurveyProgressId(), this.$content.getCurrentStep().getId());
                this.label = 1;
                Object objSubmitCtaStat = surveyRepository.submitCtaStat(id, statsCtaRequestModel, this);
                v72 v72Var = v72.t;
                if (objSubmitCtaStat == v72Var) {
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
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$onUiLoaded$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.survey.SurveyViewModel$onUiLoaded$1", f = "SurveyViewModel.kt", l = {}, m = "invokeSuspend")
    public static final class C03911 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public C03911(r02<? super C03911> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return SurveyViewModel.this.new C03911(r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03911) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            if (this.label != 0) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(obj);
            SurveyLaunchMode surveyLaunchMode = SurveyViewModel.this.launchMode;
            if (surveyLaunchMode instanceof SurveyLaunchMode.Automatic) {
                SurveyViewModel surveyViewModel = SurveyViewModel.this;
                surveyViewModel.surveyData = ((SurveyLaunchMode.Automatic) surveyViewModel.launchMode).getSurveyData();
                boolean zIsEmpty = SurveyViewModel.this.surveyData.getSteps().isEmpty();
                SurveyViewModel surveyViewModel2 = SurveyViewModel.this;
                if (zIsEmpty) {
                    SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(surveyViewModel2.surveyData.getCustomization());
                    SurveyViewModel.this.getState().setValue(new SurveyState.Error.WithoutCTA(0, surveyUiColors, new TopBarState.NoTopBarState(true, surveyUiColors, null, 4, null), 1, null));
                } else {
                    surveyViewModel2.metricTracker.surveyOpened("opened", "survey", MetricTracker.Context.FROM_AUTOMATIC, SurveyViewModel.this.surveyData.getId(), SurveyViewModel.this.surveyData.getFormatMetric());
                    SurveyData.Step step = (SurveyData.Step) th1.y(SurveyViewModel.this.surveyData.getSteps());
                    SurveyViewModel.this.currentStep = step;
                    i37<SurveyState> state = SurveyViewModel.this.getState();
                    SurveyViewModel surveyViewModel3 = SurveyViewModel.this;
                    state.setValue(surveyViewModel3.buildContentState(surveyViewModel3.surveyData, step));
                }
            } else {
                if (!(surveyLaunchMode instanceof SurveyLaunchMode.Programmatic)) {
                    u.b();
                    return null;
                }
                SurveyViewModel surveyViewModel4 = SurveyViewModel.this;
                surveyViewModel4.fetchAndShowSurvey(((SurveyLaunchMode.Programmatic) surveyViewModel4.launchMode).getSurveyId());
            }
            return g2b.a;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$reportFailure$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.survey.SurveyViewModel", f = "SurveyViewModel.kt", l = {463}, m = "reportFailure")
    public static final class C03921 extends u02 {
        int label;
        /* synthetic */ Object result;

        public C03921(r02<? super C03921> r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SurveyViewModel.this.reportFailure(null, null, this);
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.survey.SurveyViewModel$submitSurvey$1", f = "SurveyViewModel.kt", l = {328, 368, 415}, m = "invokeSuspend")
    public static final class C03931 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        final /* synthetic */ t72 $compositionAwareScope;
        final /* synthetic */ SurveyState.Content $surveyContent;
        int label;
        final /* synthetic */ SurveyViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03931(SurveyState.Content content, SurveyViewModel surveyViewModel, t72 t72Var, r02<? super C03931> r02Var) {
            super(2, r02Var);
            this.$surveyContent = content;
            this.this$0 = surveyViewModel;
            this.$compositionAwareScope = t72Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g2b invokeSuspend$lambda$7(SurveyViewModel surveyViewModel, SurveyState.Content content, t72 t72Var) {
            surveyViewModel.submitSurvey(content, t72Var);
            return g2b.a;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return new C03931(this.$surveyContent, this.this$0, this.$compositionAwareScope, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((C03931) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:71:0x0175  */
        /* JADX WARN: Code duplicated, block: B:75:0x0199  */
        /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
        /* JADX WARN: Code duplicated, block: B:81:0x01bf A[LOOP:0: B:79:0x01b9->B:81:0x01bf, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:84:0x0224  */
        /* JADX WARN: Code duplicated, block: B:86:0x0229  */
        /* JADX WARN: Code duplicated, block: B:87:0x0268  */
        /* JADX WARN: Code duplicated, block: B:96:0x02ac  */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        
            if (r15.emit(r0, r14) == r5) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x02c6, code lost:
        
            if (r15.reportFailure(r0, r1, r14) == r5) goto L98;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 716
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.survey.SurveyViewModel.C03931.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SurveyViewModel(n72 n72Var, SurveyLaunchMode surveyLaunchMode, SurveyRepository surveyRepository, AppConfig appConfig, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer) {
        n72Var.getClass();
        surveyLaunchMode.getClass();
        surveyRepository.getClass();
        appConfig.getClass();
        metricTracker.getClass();
        intercomDataLayer.getClass();
        this.dispatcher = n72Var;
        this.launchMode = surveyLaunchMode;
        this.surveyRepository = surveyRepository;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.intercomDataLayer = intercomDataLayer;
        this.surveyData = SurveyData.Companion.getNULL();
        this.state = b0a.b(SurveyState.Initial.INSTANCE);
        this.effects = ty1.b(7, null);
        this.completedResponses = new ArrayList();
        this.completedSteps = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SurveyState.Content buildContentState(SurveyData surveyData, SurveyData.Step step) {
        TopBarState senderTopBarState;
        SurveyState.Content.PrimaryCta fallback;
        SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(surveyData.getCustomization());
        ProgressBarState progressBarState = new ProgressBarState(surveyData.getShowProgressBar() && (step.getType() == SurveyData.StepType.CONTENT || step.getType() == SurveyData.StepType.QUESTION), this.completedSteps.size() / surveyData.getStepCount());
        SurveySenderData sender = surveyData.getSender();
        if ((sender != null ? sender.getName() : null) == null) {
            senderTopBarState = new TopBarState.NoTopBarState(surveyData.isDismissible(), surveyUiColors, progressBarState);
        } else {
            Avatar.Builder builder = new Avatar.Builder();
            SurveySenderAvatar avatar = surveyData.getSender().getAvatar();
            Avatar avatarBuild = builder.withImageUrl(avatar != null ? avatar.getSquareImg128() : null).withInitials(surveyData.getSender().getInitials()).build();
            avatarBuild.getClass();
            String firstName = surveyData.getSender().getFirstName();
            if (firstName == null) {
                firstName = surveyData.getSender().getName();
            }
            senderTopBarState = new TopBarState.SenderTopBarState(avatarBuild, firstName, this.appConfig, surveyData.isDismissible(), surveyUiColors, progressBarState);
        }
        String customButtonText = step.getCustomButtonText();
        List<Block.Builder> blocks = step.getBlocks();
        List<SurveyData.Step.Question> questions = step.getQuestions();
        ArrayList arrayList = new ArrayList(ph1.n(questions, 10));
        Iterator<T> it = questions.iterator();
        while (it.hasNext()) {
            arrayList.add(new QuestionState(((SurveyData.Step.Question) it.next()).getQuestionModel(), surveyUiColors));
        }
        int i = WhenMappings.$EnumSwitchMapping$0[step.getType().ordinal()];
        if (i == 1) {
            fallback = (customButtonText == null || customButtonText.length() == 0) ? new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_submit) : new SurveyState.Content.PrimaryCta.Custom(customButtonText);
        } else if (i == 2 || i == 3) {
            fallback = (customButtonText == null || customButtonText.length() == 0) ? new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button) : new SurveyState.Content.PrimaryCta.Custom(customButtonText);
        } else if (i != 4) {
            fallback = (customButtonText == null || customButtonText.length() == 0) ? new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button) : new SurveyState.Content.PrimaryCta.Custom(customButtonText);
        } else {
            fallback = (customButtonText == null || customButtonText.length() == 0) ? new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_done_button) : new SurveyState.Content.PrimaryCta.Custom(customButtonText);
        }
        List<SurveyData.SurveyActions> actions = step.getActions();
        ArrayList arrayList2 = new ArrayList(ph1.n(actions, 10));
        for (SurveyData.SurveyActions surveyActions : actions) {
            boolean z = surveyActions.getAndroidUri() == null;
            String webUrl = z ? surveyActions.getWebUrl() : surveyActions.getAndroidUri();
            String actionTitle = surveyActions.getActionTitle();
            if (webUrl == null) {
                webUrl = BuildConfig.FLAVOR;
            }
            arrayList2.add(new SurveyState.Content.SecondaryCta(actionTitle, webUrl, z));
        }
        return new SurveyState.Content(step, blocks, arrayList, arrayList2, fallback, surveyUiColors, senderTopBarState);
    }

    public static /* synthetic */ void continueClicked$default(SurveyViewModel surveyViewModel, t72 t72Var, int i, Object obj) {
        if ((i & 1) != 0) {
            t72Var = null;
        }
        surveyViewModel.continueClicked(t72Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void emitLoading() {
        i37<SurveyState> i37Var = this.state;
        i37Var.setValue(new SurveyState.Loading(this.state.getValue().getSurveyUiColors(), i37Var.getValue().getTopBarState()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchAndShowSurvey(String str) {
        oy0.d(rhb.b(this), this.dispatcher, null, new AnonymousClass1(str, this, SurveyViewModelKt.toSurveyUiColors(this.surveyData.getCustomization()), null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object reportFailure(String str, String str2, r02<? super g2b> r02Var) throws Throwable {
        C03921 c03921;
        if (r02Var instanceof C03921) {
            c03921 = (C03921) r02Var;
            int i = c03921.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c03921.label = i - Integer.MIN_VALUE;
            } else {
                c03921 = new C03921(r02Var);
            }
        } else {
            c03921 = new C03921(r02Var);
        }
        Object objReportFailure = c03921.result;
        int i2 = c03921.label;
        if (i2 == 0) {
            dv8.b(objReportFailure);
            SurveyRepository surveyRepository = this.surveyRepository;
            c03921.label = 1;
            objReportFailure = surveyRepository.reportFailure(str, str2, c03921);
            v72 v72Var = v72.t;
            if (objReportFailure == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objReportFailure);
        }
        return g2b.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendDismissedEvent(CloseEventTrigger closeEventTrigger) {
        String str;
        String str2;
        SurveyState value = this.state.getValue();
        if (value instanceof SurveyState.Loading) {
            str = MetricTracker.Object.SURVEY_STEP_LOADING;
        } else {
            str = value instanceof SurveyState.Error ? MetricTracker.Object.SURVEY_STEP_ERROR : "survey";
        }
        String str3 = str;
        int i = WhenMappings.$EnumSwitchMapping$1[closeEventTrigger.ordinal()];
        if (i == 1) {
            str2 = MetricTracker.Context.FROM_CTA;
        } else if (i == 2) {
            str2 = MetricTracker.Context.FROM_CLOSE_BUTTON;
        } else if (i == 3) {
            str2 = MetricTracker.Context.FROM_ONWARD_EXTERNAL_LINK;
        } else {
            if (i != 4) {
                u.b();
                return;
            }
            str2 = MetricTracker.Context.FROM_ONWARD_DEEP_LINK;
        }
        String str4 = str2;
        SurveyData.Step step = this.currentStep;
        if (this.surveyData.getSteps().isEmpty() || step == null) {
            return;
        }
        String str5 = step.getType() == SurveyData.StepType.THANK_YOU ? MetricTracker.Action.CLOSED : MetricTracker.Action.DISMISSED;
        Iterator<T> it = this.completedSteps.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((SurveyData.Step) it.next()).getQuestions().size();
        }
        this.metricTracker.surveyDismissed(str5, str3, str4, this.surveyData.getId(), this.surveyData.getFormatMetric(), this.completedSteps.size(), this.surveyData.getStepCount(), step.getQuestions().size() + size);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitSurvey(SurveyState.Content content, t72 t72Var) {
        oy0.d(rhb.b(this), this.dispatcher, null, new C03931(content, this, t72Var, null), 2);
    }

    public static /* synthetic */ void submitSurvey$default(SurveyViewModel surveyViewModel, SurveyState.Content content, t72 t72Var, int i, Object obj) {
        if ((i & 2) != 0) {
            t72Var = null;
        }
        surveyViewModel.submitSurvey(content, t72Var);
    }

    public final void continueClicked(t72 t72Var) {
        SurveyState value = this.state.getValue();
        SurveyState.Content content = value instanceof SurveyState.Content ? (SurveyState.Content) value : null;
        if (content == null) {
            return;
        }
        submitSurvey(content, t72Var);
    }

    public final n72 getDispatcher() {
        return this.dispatcher;
    }

    public final f37<SurveyEffects> getEffects() {
        return this.effects;
    }

    public final i37<SurveyState> getState() {
        return this.state;
    }

    public final void onAnswerUpdated() {
        int i;
        SurveyState value = this.state.getValue();
        SurveyState.Content content = value instanceof SurveyState.Content ? (SurveyState.Content) value : null;
        if (content == null) {
            return;
        }
        float stepCount = this.surveyData.getStepCount();
        int size = this.completedSteps.size();
        List<QuestionState> questions = content.getQuestions();
        if (questions == null || !questions.isEmpty()) {
            Iterator<T> it = questions.iterator();
            i = 0;
            while (it.hasNext()) {
                if ((((QuestionState) it.next()).getValidationError() instanceof ValidationError.NoValidationError) && (i = i + 1) < 0) {
                    throw new ArithmeticException("Count overflow has happened.");
                }
            }
        } else {
            i = 0;
        }
        this.state.setValue(SurveyState.Content.copy$default(content, null, null, null, null, null, null, content.getTopBarState().withProgressBarState(ProgressBarState.copy$default(content.getTopBarState().getProgressBarState(), false, (i / (stepCount * content.getCurrentStep().getQuestions().size())) + (size / stepCount), 1, null)), 63, null));
    }

    public final void onCloseClicked(CloseEventTrigger closeEventTrigger) {
        closeEventTrigger.getClass();
        if (this.surveyData.isDismissible() || (this.state.getValue() instanceof SurveyState.Error)) {
            oy0.d(rhb.b(this), null, null, new C03891(closeEventTrigger, null), 3);
        }
    }

    public final void onSecondaryCtaClicked(SurveyState.Content.SecondaryCta secondaryCta) {
        secondaryCta.getClass();
        CloseEventTrigger closeEventTrigger = secondaryCta.isExternalUrl() ? CloseEventTrigger.SECONDARY_CTA_EXTERNAL_LINK : CloseEventTrigger.SECONDARY_CTA_DEEP_LINK;
        SurveyState value = this.state.getValue();
        SurveyState.Content content = value instanceof SurveyState.Content ? (SurveyState.Content) value : null;
        if (closeEventTrigger == CloseEventTrigger.SECONDARY_CTA_DEEP_LINK && content != null) {
            oy0.d(dn4.t, null, null, new C03901(content, null), 3);
        }
        onCloseClicked(closeEventTrigger);
    }

    public final void onUiLoaded() {
        if (xj5.a(this.state.getValue(), SurveyState.Initial.INSTANCE)) {
            oy0.d(rhb.b(this), this.dispatcher, null, new C03911(null), 2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [io.intercom.android.sdk.survey.SurveyViewModel$Companion$factory$1] */
        private final SurveyViewModel$Companion$factory$1 factory(final SurveyLaunchMode surveyLaunchMode) {
            return new thb.c() { // from class: io.intercom.android.sdk.survey.SurveyViewModel$Companion$factory$1
                @Override // thb.c
                public <T extends mhb> T create(Class<T> cls) {
                    cls.getClass();
                    return new SurveyViewModel(null, surveyLaunchMode, null, null, null, null, 61, null);
                }

                @Override // thb.c
                public /* bridge */ /* synthetic */ mhb create(Class cls, lb2 lb2Var) {
                    return super.create(cls, lb2Var);
                }

                @Override // thb.c
                public /* bridge */ /* synthetic */ mhb create(wn5 wn5Var, lb2 lb2Var) {
                    return super.create(wn5Var, lb2Var);
                }
            };
        }

        public final SurveyViewModel create(whb whbVar, SurveyLaunchMode surveyLaunchMode) {
            whbVar.getClass();
            surveyLaunchMode.getClass();
            SurveyViewModel$Companion$factory$1 surveyViewModel$Companion$factory$1Factory = factory(surveyLaunchMode);
            surveyViewModel$Companion$factory$1Factory.getClass();
            vhb viewModelStore = whbVar.getViewModelStore();
            lb2 defaultViewModelCreationExtras = whbVar instanceof wt4 ? ((wt4) whbVar).getDefaultViewModelCreationExtras() : lb2.a.b;
            viewModelStore.getClass();
            defaultViewModelCreationExtras.getClass();
            uhb uhbVar = new uhb(viewModelStore, surveyViewModel$Companion$factory$1Factory, defaultViewModelCreationExtras);
            sd1 sd1VarA = ll8.a(SurveyViewModel.class);
            String strE = sd1VarA.e();
            if (strE != null) {
                return (SurveyViewModel) uhbVar.a(sd1VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strE));
            }
            z90.a("Local and anonymous classes can not be ViewModels");
            return null;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public SurveyViewModel(n72 n72Var, SurveyLaunchMode surveyLaunchMode, SurveyRepository surveyRepository, AppConfig appConfig, MetricTracker metricTracker, IntercomDataLayer intercomDataLayer, int i, qq2 qq2Var) {
        if ((i & 1) != 0) {
            et2 et2Var = i23.a;
            n72Var = wr2.v;
        }
        this(n72Var, surveyLaunchMode, (i & 4) != 0 ? new SurveyRepository(null, 1, 0 == true ? 1 : 0) : surveyRepository, (i & 8) != 0 ? (AppConfig) z.a() : appConfig, (i & 16) != 0 ? Injector.get().getMetricTracker() : metricTracker, (i & 32) != 0 ? Injector.get().getDataLayer() : intercomDataLayer);
    }
}
