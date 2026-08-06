package io.intercom.android.sdk.survey;

import defpackage.e44;
import defpackage.g2b;
import defpackage.ho2;
import defpackage.mh4;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.ux1;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.model.SurveyData;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class SurveyState {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Initial extends SurveyState {
        public static final int $stable = 0;
        public static final Initial INSTANCE;
        private static final SurveyUiColors surveyUiColors;
        private static final TopBarState topBarState;

        static {
            Initial initial = new Initial();
            INSTANCE = initial;
            surveyUiColors = ux1.a(null, null, 3, null);
            topBarState = new TopBarState.NoTopBarState(true, initial.getSurveyUiColors(), null, 4, null);
        }

        private Initial() {
            super(null);
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public SurveyUiColors getSurveyUiColors() {
            return surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public TopBarState getTopBarState() {
            return topBarState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Loading extends SurveyState {
        public static final int $stable = 0;
        private final SurveyUiColors surveyUiColors;
        private final TopBarState topBarState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(SurveyUiColors surveyUiColors, TopBarState topBarState) {
            super(null);
            surveyUiColors.getClass();
            topBarState.getClass();
            this.surveyUiColors = surveyUiColors;
            this.topBarState = topBarState;
        }

        public static /* synthetic */ Loading copy$default(Loading loading, SurveyUiColors surveyUiColors, TopBarState topBarState, int i, Object obj) {
            if ((i & 1) != 0) {
                surveyUiColors = loading.surveyUiColors;
            }
            if ((i & 2) != 0) {
                topBarState = loading.topBarState;
            }
            return loading.copy(surveyUiColors, topBarState);
        }

        public final SurveyUiColors component1() {
            return this.surveyUiColors;
        }

        public final TopBarState component2() {
            return this.topBarState;
        }

        public final Loading copy(SurveyUiColors surveyUiColors, TopBarState topBarState) {
            surveyUiColors.getClass();
            topBarState.getClass();
            return new Loading(surveyUiColors, topBarState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) obj;
            return xj5.a(this.surveyUiColors, loading.surveyUiColors) && xj5.a(this.topBarState, loading.topBarState);
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        public int hashCode() {
            return this.topBarState.hashCode() + (this.surveyUiColors.hashCode() * 31);
        }

        public String toString() {
            return "Loading(surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }
    }

    public /* synthetic */ SurveyState(qq2 qq2Var) {
        this();
    }

    public abstract SurveyUiColors getSurveyUiColors();

    public abstract TopBarState getTopBarState();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Content extends SurveyState {
        public static final int $stable = 8;
        private final SurveyData.Step currentStep;
        private final PrimaryCta primaryCta;
        private final List<QuestionState> questions;
        private final List<SecondaryCta> secondaryCtaActions;
        private final List<Block.Builder> stepTitle;
        private final SurveyUiColors surveyUiColors;
        private final TopBarState topBarState;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class SecondaryCta {
            public static final int $stable = 0;
            private final String buttonText;
            private final String destination;
            private final boolean isExternalUrl;

            public SecondaryCta(String str, String str2, boolean z) {
                str.getClass();
                str2.getClass();
                this.buttonText = str;
                this.destination = str2;
                this.isExternalUrl = z;
            }

            public static /* synthetic */ SecondaryCta copy$default(SecondaryCta secondaryCta, String str, String str2, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = secondaryCta.buttonText;
                }
                if ((i & 2) != 0) {
                    str2 = secondaryCta.destination;
                }
                if ((i & 4) != 0) {
                    z = secondaryCta.isExternalUrl;
                }
                return secondaryCta.copy(str, str2, z);
            }

            public final String component1() {
                return this.buttonText;
            }

            public final String component2() {
                return this.destination;
            }

            public final boolean component3() {
                return this.isExternalUrl;
            }

            public final SecondaryCta copy(String str, String str2, boolean z) {
                str.getClass();
                str2.getClass();
                return new SecondaryCta(str, str2, z);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SecondaryCta)) {
                    return false;
                }
                SecondaryCta secondaryCta = (SecondaryCta) obj;
                return xj5.a(this.buttonText, secondaryCta.buttonText) && xj5.a(this.destination, secondaryCta.destination) && this.isExternalUrl == secondaryCta.isExternalUrl;
            }

            public final String getButtonText() {
                return this.buttonText;
            }

            public final String getDestination() {
                return this.destination;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isExternalUrl) + ru3.c(this.buttonText.hashCode() * 31, 31, this.destination);
            }

            public final boolean isExternalUrl() {
                return this.isExternalUrl;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("SecondaryCta(buttonText=");
                sb.append(this.buttonText);
                sb.append(", destination=");
                sb.append(this.destination);
                sb.append(", isExternalUrl=");
                return pi1.a(sb, this.isExternalUrl, ')');
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(SurveyData.Step step, List<Block.Builder> list, List<QuestionState> list2, List<SecondaryCta> list3, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState) {
            super(null);
            step.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            primaryCta.getClass();
            surveyUiColors.getClass();
            topBarState.getClass();
            this.currentStep = step;
            this.stepTitle = list;
            this.questions = list2;
            this.secondaryCtaActions = list3;
            this.primaryCta = primaryCta;
            this.surveyUiColors = surveyUiColors;
            this.topBarState = topBarState;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, SurveyData.Step step, List list, List list2, List list3, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState, int i, Object obj) {
            if ((i & 1) != 0) {
                step = content.currentStep;
            }
            if ((i & 2) != 0) {
                list = content.stepTitle;
            }
            if ((i & 4) != 0) {
                list2 = content.questions;
            }
            if ((i & 8) != 0) {
                list3 = content.secondaryCtaActions;
            }
            if ((i & 16) != 0) {
                primaryCta = content.primaryCta;
            }
            if ((i & 32) != 0) {
                surveyUiColors = content.surveyUiColors;
            }
            if ((i & 64) != 0) {
                topBarState = content.topBarState;
            }
            SurveyUiColors surveyUiColors2 = surveyUiColors;
            TopBarState topBarState2 = topBarState;
            PrimaryCta primaryCta2 = primaryCta;
            List list4 = list2;
            return content.copy(step, list, list4, list3, primaryCta2, surveyUiColors2, topBarState2);
        }

        public final SurveyData.Step component1() {
            return this.currentStep;
        }

        public final List<Block.Builder> component2() {
            return this.stepTitle;
        }

        public final List<QuestionState> component3() {
            return this.questions;
        }

        public final List<SecondaryCta> component4() {
            return this.secondaryCtaActions;
        }

        public final PrimaryCta component5() {
            return this.primaryCta;
        }

        public final SurveyUiColors component6() {
            return this.surveyUiColors;
        }

        public final TopBarState component7() {
            return this.topBarState;
        }

        public final Content copy(SurveyData.Step step, List<Block.Builder> list, List<QuestionState> list2, List<SecondaryCta> list3, PrimaryCta primaryCta, SurveyUiColors surveyUiColors, TopBarState topBarState) {
            step.getClass();
            list.getClass();
            list2.getClass();
            list3.getClass();
            primaryCta.getClass();
            surveyUiColors.getClass();
            topBarState.getClass();
            return new Content(step, list, list2, list3, primaryCta, surveyUiColors, topBarState);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return xj5.a(this.currentStep, content.currentStep) && xj5.a(this.stepTitle, content.stepTitle) && xj5.a(this.questions, content.questions) && xj5.a(this.secondaryCtaActions, content.secondaryCtaActions) && xj5.a(this.primaryCta, content.primaryCta) && xj5.a(this.surveyUiColors, content.surveyUiColors) && xj5.a(this.topBarState, content.topBarState);
        }

        public final SurveyData.Step getCurrentStep() {
            return this.currentStep;
        }

        public final PrimaryCta getPrimaryCta() {
            return this.primaryCta;
        }

        public final List<QuestionState> getQuestions() {
            return this.questions;
        }

        public final List<SecondaryCta> getSecondaryCtaActions() {
            return this.secondaryCtaActions;
        }

        public final List<Block.Builder> getStepTitle() {
            return this.stepTitle;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        @Override // io.intercom.android.sdk.survey.SurveyState
        public TopBarState getTopBarState() {
            return this.topBarState;
        }

        public int hashCode() {
            return this.topBarState.hashCode() + ((this.surveyUiColors.hashCode() + ((this.primaryCta.hashCode() + ho2.a(ho2.a(ho2.a(this.currentStep.hashCode() * 31, 31, this.stepTitle), 31, this.questions), 31, this.secondaryCtaActions)) * 31)) * 31);
        }

        public String toString() {
            return "Content(currentStep=" + this.currentStep + ", stepTitle=" + this.stepTitle + ", questions=" + this.questions + ", secondaryCtaActions=" + this.secondaryCtaActions + ", primaryCta=" + this.primaryCta + ", surveyUiColors=" + this.surveyUiColors + ", topBarState=" + this.topBarState + ')';
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static abstract class PrimaryCta {
            public static final int $stable = 0;

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Custom extends PrimaryCta {
                public static final int $stable = 0;
                private final String text;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Custom(String str) {
                    super(null);
                    str.getClass();
                    this.text = str;
                }

                public static /* synthetic */ Custom copy$default(Custom custom, String str, int i, Object obj) {
                    if ((i & 1) != 0) {
                        str = custom.text;
                    }
                    return custom.copy(str);
                }

                public final String component1() {
                    return this.text;
                }

                public final Custom copy(String str) {
                    str.getClass();
                    return new Custom(str);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Custom) && xj5.a(this.text, ((Custom) obj).text);
                }

                public final String getText() {
                    return this.text;
                }

                public int hashCode() {
                    return this.text.hashCode();
                }

                public String toString() {
                    return wu0.a(new StringBuilder("Custom(text="), this.text, ')');
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class Fallback extends PrimaryCta {
                public static final int $stable = 0;
                private final int fallbackTextRes;

                public Fallback(int i) {
                    super(null);
                    this.fallbackTextRes = i;
                }

                public static /* synthetic */ Fallback copy$default(Fallback fallback, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = fallback.fallbackTextRes;
                    }
                    return fallback.copy(i);
                }

                public final int component1() {
                    return this.fallbackTextRes;
                }

                public final Fallback copy(int i) {
                    return new Fallback(i);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Fallback) && this.fallbackTextRes == ((Fallback) obj).fallbackTextRes;
                }

                public final int getFallbackTextRes() {
                    return this.fallbackTextRes;
                }

                public int hashCode() {
                    return Integer.hashCode(this.fallbackTextRes);
                }

                public String toString() {
                    return e44.a(new StringBuilder("Fallback(fallbackTextRes="), this.fallbackTextRes, ')');
                }
            }

            public /* synthetic */ PrimaryCta(qq2 qq2Var) {
                this();
            }

            private PrimaryCta() {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class Error extends SurveyState {
        public static final int $stable = 0;

        private Error() {
            super(null);
        }

        public abstract int getMessageResId();

        public /* synthetic */ Error(qq2 qq2Var) {
            this();
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class WithoutCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;
            private final SurveyUiColors surveyUiColors;
            private final TopBarState topBarState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithoutCTA(int i, SurveyUiColors surveyUiColors, TopBarState topBarState) {
                super(null);
                surveyUiColors.getClass();
                topBarState.getClass();
                this.messageResId = i;
                this.surveyUiColors = surveyUiColors;
                this.topBarState = topBarState;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState.Error
            public int getMessageResId() {
                return this.messageResId;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            public /* synthetic */ WithoutCTA(int i, SurveyUiColors surveyUiColors, TopBarState topBarState, int i2, qq2 qq2Var) {
                this((i2 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i, surveyUiColors, topBarState);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class WithCTA extends Error {
            public static final int $stable = 0;
            private final int messageResId;
            private final mh4<g2b> onClick;
            private final SurveyUiColors surveyUiColors;
            private final TopBarState topBarState;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithCTA(int i, SurveyUiColors surveyUiColors, TopBarState topBarState, mh4<g2b> mh4Var) {
                super(null);
                surveyUiColors.getClass();
                topBarState.getClass();
                mh4Var.getClass();
                this.messageResId = i;
                this.surveyUiColors = surveyUiColors;
                this.topBarState = topBarState;
                this.onClick = mh4Var;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState.Error
            public int getMessageResId() {
                return this.messageResId;
            }

            public final mh4<g2b> getOnClick() {
                return this.onClick;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public SurveyUiColors getSurveyUiColors() {
                return this.surveyUiColors;
            }

            @Override // io.intercom.android.sdk.survey.SurveyState
            public TopBarState getTopBarState() {
                return this.topBarState;
            }

            public /* synthetic */ WithCTA(int i, SurveyUiColors surveyUiColors, TopBarState topBarState, mh4 mh4Var, int i2, qq2 qq2Var) {
                this((i2 & 1) != 0 ? R.string.intercom_inbox_error_state_title : i, surveyUiColors, topBarState, mh4Var);
            }
        }
    }

    private SurveyState() {
    }
}
