package defpackage;

import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import io.intercom.android.sdk.m5.conversation.ui.components.ConversationTopAppBarKt;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.dropdown.DropDownQuestionKt;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f52 implements ci4 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ di4 B;
    public final /* synthetic */ int t = 0;
    public final /* synthetic */ oh4 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f52(ox6 ox6Var, SurveyData.Step.Question.DropDownQuestionModel dropDownQuestionModel, Answer answer, oh4 oh4Var, SurveyUiColors surveyUiColors, ci4 ci4Var, int i, int i2) {
        this.x = ox6Var;
        this.y = dropDownQuestionModel;
        this.z = answer;
        this.u = oh4Var;
        this.A = surveyUiColors;
        this.B = ci4Var;
        this.v = i;
        this.w = i2;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.t;
        di4 di4Var = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return ConversationTopAppBarKt.ConversationTopAppBar$lambda$10((TopAppBarUiState) obj6, (mh4) obj5, (mh4) obj4, (mh4) obj3, this.u, (oh4) di4Var, this.v, this.w, (jt1) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return DropDownQuestionKt.DropDownQuestion$lambda$11((ox6) obj6, (SurveyData.Step.Question.DropDownQuestionModel) obj5, (Answer) obj4, this.u, (SurveyUiColors) obj3, (ci4) di4Var, this.v, this.w, (jt1) obj, iIntValue2);
        }
    }

    public /* synthetic */ f52(TopAppBarUiState topAppBarUiState, mh4 mh4Var, mh4 mh4Var2, mh4 mh4Var3, oh4 oh4Var, oh4 oh4Var2, int i, int i2) {
        this.x = topAppBarUiState;
        this.y = mh4Var;
        this.z = mh4Var2;
        this.A = mh4Var3;
        this.u = oh4Var;
        this.B = oh4Var2;
        this.v = i;
        this.w = i2;
    }
}
