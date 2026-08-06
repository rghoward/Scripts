package io.intercom.android.sdk.survey;

import defpackage.qq2;
import defpackage.ru3;
import defpackage.uo2;
import defpackage.xj5;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.Avatar;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TopBarState {
    public static final int $stable = 0;

    public /* synthetic */ TopBarState(qq2 qq2Var) {
        this();
    }

    public abstract TopBarState enableDismissButton();

    public abstract ProgressBarState getProgressBarState();

    public abstract boolean getShowDismissButton();

    public abstract SurveyUiColors getSurveyUiColors();

    public abstract TopBarState withProgressBarState(ProgressBarState progressBarState);

    private TopBarState() {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class NoTopBarState extends TopBarState {
        public static final int $stable = 0;
        private final ProgressBarState progressBarState;
        private final boolean showDismissButton;
        private final SurveyUiColors surveyUiColors;

        public /* synthetic */ NoTopBarState(boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i, qq2 qq2Var) {
            this(z, surveyUiColors, (i & 4) != 0 ? new ProgressBarState(false, 0.0f, 3, null) : progressBarState);
        }

        public static /* synthetic */ NoTopBarState copy$default(NoTopBarState noTopBarState, boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i, Object obj) {
            if ((i & 1) != 0) {
                z = noTopBarState.showDismissButton;
            }
            if ((i & 2) != 0) {
                surveyUiColors = noTopBarState.surveyUiColors;
            }
            if ((i & 4) != 0) {
                progressBarState = noTopBarState.progressBarState;
            }
            return noTopBarState.copy(z, surveyUiColors, progressBarState);
        }

        public final boolean component1() {
            return this.showDismissButton;
        }

        public final SurveyUiColors component2() {
            return this.surveyUiColors;
        }

        public final ProgressBarState component3() {
            return this.progressBarState;
        }

        public final NoTopBarState copy(boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            surveyUiColors.getClass();
            progressBarState.getClass();
            return new NoTopBarState(z, surveyUiColors, progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState enableDismissButton() {
            return copy$default(this, true, null, null, 6, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NoTopBarState)) {
                return false;
            }
            NoTopBarState noTopBarState = (NoTopBarState) obj;
            return this.showDismissButton == noTopBarState.showDismissButton && xj5.a(this.surveyUiColors, noTopBarState.surveyUiColors) && xj5.a(this.progressBarState, noTopBarState.progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public int hashCode() {
            return this.progressBarState.hashCode() + ((this.surveyUiColors.hashCode() + (Boolean.hashCode(this.showDismissButton) * 31)) * 31);
        }

        public String toString() {
            return "NoTopBarState(showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState withProgressBarState(ProgressBarState progressBarState) {
            progressBarState.getClass();
            return copy$default(this, false, null, progressBarState, 3, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NoTopBarState(boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            super(null);
            surveyUiColors.getClass();
            progressBarState.getClass();
            this.showDismissButton = z;
            this.surveyUiColors = surveyUiColors;
            this.progressBarState = progressBarState;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SenderTopBarState extends TopBarState {
        public static final int $stable = 8;
        private final AppConfig appConfig;
        private final Avatar avatar;
        private final ProgressBarState progressBarState;
        private final String senderName;
        private final boolean showDismissButton;
        private final SurveyUiColors surveyUiColors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SenderTopBarState(Avatar avatar, String str, AppConfig appConfig, boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            super(null);
            avatar.getClass();
            str.getClass();
            appConfig.getClass();
            surveyUiColors.getClass();
            progressBarState.getClass();
            this.avatar = avatar;
            this.senderName = str;
            this.appConfig = appConfig;
            this.showDismissButton = z;
            this.surveyUiColors = surveyUiColors;
            this.progressBarState = progressBarState;
        }

        public static /* synthetic */ SenderTopBarState copy$default(SenderTopBarState senderTopBarState, Avatar avatar, String str, AppConfig appConfig, boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i, Object obj) {
            if ((i & 1) != 0) {
                avatar = senderTopBarState.avatar;
            }
            if ((i & 2) != 0) {
                str = senderTopBarState.senderName;
            }
            if ((i & 4) != 0) {
                appConfig = senderTopBarState.appConfig;
            }
            if ((i & 8) != 0) {
                z = senderTopBarState.showDismissButton;
            }
            if ((i & 16) != 0) {
                surveyUiColors = senderTopBarState.surveyUiColors;
            }
            if ((i & 32) != 0) {
                progressBarState = senderTopBarState.progressBarState;
            }
            SurveyUiColors surveyUiColors2 = surveyUiColors;
            ProgressBarState progressBarState2 = progressBarState;
            return senderTopBarState.copy(avatar, str, appConfig, z, surveyUiColors2, progressBarState2);
        }

        public final Avatar component1() {
            return this.avatar;
        }

        public final String component2() {
            return this.senderName;
        }

        public final AppConfig component3() {
            return this.appConfig;
        }

        public final boolean component4() {
            return this.showDismissButton;
        }

        public final SurveyUiColors component5() {
            return this.surveyUiColors;
        }

        public final ProgressBarState component6() {
            return this.progressBarState;
        }

        public final SenderTopBarState copy(Avatar avatar, String str, AppConfig appConfig, boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState) {
            avatar.getClass();
            str.getClass();
            appConfig.getClass();
            surveyUiColors.getClass();
            progressBarState.getClass();
            return new SenderTopBarState(avatar, str, appConfig, z, surveyUiColors, progressBarState);
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState enableDismissButton() {
            return copy$default(this, null, null, null, true, null, null, 55, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SenderTopBarState)) {
                return false;
            }
            SenderTopBarState senderTopBarState = (SenderTopBarState) obj;
            return xj5.a(this.avatar, senderTopBarState.avatar) && xj5.a(this.senderName, senderTopBarState.senderName) && xj5.a(this.appConfig, senderTopBarState.appConfig) && this.showDismissButton == senderTopBarState.showDismissButton && xj5.a(this.surveyUiColors, senderTopBarState.surveyUiColors) && xj5.a(this.progressBarState, senderTopBarState.progressBarState);
        }

        public final AppConfig getAppConfig() {
            return this.appConfig;
        }

        public final Avatar getAvatar() {
            return this.avatar;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public ProgressBarState getProgressBarState() {
            return this.progressBarState;
        }

        public final String getSenderName() {
            return this.senderName;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public boolean getShowDismissButton() {
            return this.showDismissButton;
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public SurveyUiColors getSurveyUiColors() {
            return this.surveyUiColors;
        }

        public int hashCode() {
            return this.progressBarState.hashCode() + ((this.surveyUiColors.hashCode() + uo2.a((this.appConfig.hashCode() + ru3.c(this.avatar.hashCode() * 31, 31, this.senderName)) * 31, this.showDismissButton, 31)) * 31);
        }

        public String toString() {
            return "SenderTopBarState(avatar=" + this.avatar + ", senderName=" + this.senderName + ", appConfig=" + this.appConfig + ", showDismissButton=" + this.showDismissButton + ", surveyUiColors=" + this.surveyUiColors + ", progressBarState=" + this.progressBarState + ')';
        }

        @Override // io.intercom.android.sdk.survey.TopBarState
        public TopBarState withProgressBarState(ProgressBarState progressBarState) {
            progressBarState.getClass();
            return copy$default(this, null, null, null, false, null, progressBarState, 31, null);
        }

        public /* synthetic */ SenderTopBarState(Avatar avatar, String str, AppConfig appConfig, boolean z, SurveyUiColors surveyUiColors, ProgressBarState progressBarState, int i, qq2 qq2Var) {
            this(avatar, str, appConfig, z, surveyUiColors, (i & 32) != 0 ? new ProgressBarState(false, 0.0f, 3, null) : progressBarState);
        }
    }
}
