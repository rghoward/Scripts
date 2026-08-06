package io.intercom.android.sdk.survey;

import com.intercom.twig.BuildConfig;
import defpackage.aa0;
import defpackage.bl7;
import defpackage.ci4;
import defpackage.dv8;
import defpackage.el5;
import defpackage.fw0;
import defpackage.g2b;
import defpackage.h37;
import defpackage.js7;
import defpackage.jw0;
import defpackage.m10;
import defpackage.oy0;
import defpackage.p6a;
import defpackage.ph1;
import defpackage.r02;
import defpackage.t72;
import defpackage.th1;
import defpackage.u;
import defpackage.v72;
import defpackage.ws0;
import defpackage.xj5;
import defpackage.xm2;
import defpackage.yz9;
import defpackage.z2a;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.AttributeValidatorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class QuestionState {
    public static final int $stable = 8;
    private final h37 _answer$delegate;
    private final yz9 answer$delegate;
    private final fw0 bringIntoViewRequester;
    private final SurveyData.Step.Question.QuestionModel questionModel;
    private final SurveyUiColors surveyUiColors;
    private final h37 validationError$delegate;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyData.Step.Question.QuestionValidation.ValidationType.values().length];
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.PHONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.intercom.android.sdk.survey.QuestionState$bringIntoView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "io.intercom.android.sdk.survey.QuestionState$bringIntoView$1", f = "SurveyViewModel.kt", l = {767}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        int label;

        public AnonymousClass1(r02<? super AnonymousClass1> r02Var) {
            super(2, r02Var);
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return QuestionState.this.new AnonymousClass1(r02Var);
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
                fw0 bringIntoViewRequester = QuestionState.this.getBringIntoViewRequester();
                this.label = 1;
                Object objA = bringIntoViewRequester.a(null, this);
                v72 v72Var = v72.t;
                if (objA == v72Var) {
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

    public QuestionState(SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors) {
        questionModel.getClass();
        surveyUiColors.getClass();
        this.questionModel = questionModel;
        this.surveyUiColors = surveyUiColors;
        this.validationError$delegate = bl7.i(ValidationError.Unchecked.INSTANCE);
        this._answer$delegate = bl7.i(Answer.NoAnswer.InitialNoAnswer.INSTANCE);
        this.answer$delegate = bl7.f(new m10(1, this));
        this.bringIntoViewRequester = new jw0();
    }

    public static /* synthetic */ QuestionState copy$default(QuestionState questionState, SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors, int i, Object obj) {
        if ((i & 1) != 0) {
            questionModel = questionState.questionModel;
        }
        if ((i & 2) != 0) {
            surveyUiColors = questionState.surveyUiColors;
        }
        return questionState.copy(questionModel, surveyUiColors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Answer get_answer() {
        return (Answer) this._answer$delegate.getValue();
    }

    private final void set_answer(Answer answer) {
        this._answer$delegate.setValue(answer);
    }

    public final el5 bringIntoView(t72 t72Var) {
        t72Var.getClass();
        return oy0.d(t72Var, null, null, new AnonymousClass1(null), 3);
    }

    public final SurveyData.Step.Question.QuestionModel component1() {
        return this.questionModel;
    }

    public final SurveyUiColors component2() {
        return this.surveyUiColors;
    }

    public final QuestionState copy(SurveyData.Step.Question.QuestionModel questionModel, SurveyUiColors surveyUiColors) {
        questionModel.getClass();
        surveyUiColors.getClass();
        return new QuestionState(questionModel, surveyUiColors);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuestionState)) {
            return false;
        }
        QuestionState questionState = (QuestionState) obj;
        return xj5.a(this.questionModel, questionState.questionModel) && xj5.a(this.surveyUiColors, questionState.surveyUiColors);
    }

    public final Answer getAnswer() {
        return (Answer) this.answer$delegate.getValue();
    }

    public final fw0 getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    public final SurveyData.Step.Question.QuestionModel getQuestionModel() {
        return this.questionModel;
    }

    public final SurveyUiColors getSurveyUiColors() {
        return this.surveyUiColors;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ValidationError getValidationError() {
        return (ValidationError) this.validationError$delegate.getValue();
    }

    public int hashCode() {
        return this.surveyUiColors.hashCode() + (this.questionModel.hashCode() * 31);
    }

    public final void setAnswer(Answer answer) {
        answer.getClass();
        set_answer(answer);
        if (answer instanceof Answer.NoAnswer.ResetNoAnswer) {
            setValidationError(ValidationError.Unchecked.INSTANCE);
        }
    }

    public final void setValidationError(ValidationError validationError) {
        validationError.getClass();
        this.validationError$delegate.setValue(validationError);
    }

    public String toString() {
        return "QuestionState(questionModel=" + this.questionModel + ", surveyUiColors=" + this.surveyUiColors + ')';
    }

    /* JADX WARN: Code duplicated, block: B:102:0x025c  */
    public final void validate() {
        ValidationError validationStringError;
        List<Answer.MediaAnswer.MediaItem> mediaItems;
        String str;
        ValidationError validationStringError2;
        if ((getAnswer() instanceof Answer.NoAnswer) && this.questionModel.isRequired()) {
            setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_required_response, null, 2, null));
            return;
        }
        if (getAnswer() instanceof Answer.NoAnswer) {
            setValidationError(ValidationError.NoValidationError.INSTANCE);
            return;
        }
        SurveyData.Step.Question.QuestionModel questionModel = this.questionModel;
        if (questionModel instanceof SurveyData.Step.Question.MultipleChoiceQuestionModel) {
            if (getAnswer() instanceof Answer.MultipleAnswer) {
                Answer answer = getAnswer();
                answer.getClass();
                int size = ((Answer.MultipleAnswer) answer).getAnswers().size();
                int minSelection = ((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMinSelection();
                SurveyData.Step.Question.QuestionModel questionModel2 = this.questionModel;
                if (size < minSelection) {
                    setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_multi_select_too_few_responses, ws0.h(new js7("response_count", String.valueOf(((SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel2).getMinSelection())))));
                    return;
                } else if (size > ((SurveyData.Step.Question.MultipleChoiceQuestionModel) questionModel2).getMaxSelection()) {
                    setValidationError(new ValidationError.ValidationStringError(R.string.intercom_surveys_multi_select_too_many_responses, ws0.h(new js7("response_count", String.valueOf(((SurveyData.Step.Question.MultipleChoiceQuestionModel) this.questionModel).getMaxSelection())))));
                    return;
                } else {
                    setValidationError(ValidationError.NoValidationError.INSTANCE);
                    return;
                }
            }
            return;
        }
        if (!(questionModel instanceof SurveyData.Step.Question.ShortTextQuestionModel)) {
            if (questionModel instanceof SurveyData.Step.Question.LongTextQuestionModel) {
                setValidationError((((SurveyData.Step.Question.LongTextQuestionModel) questionModel).getCharacterLimit() == null || getAnswer().getLength() <= ((SurveyData.Step.Question.LongTextQuestionModel) this.questionModel).getCharacterLimit().intValue()) ? ValidationError.NoValidationError.INSTANCE : new ValidationError.ValidationStringError(R.string.intercom_surveys_response_too_long, ws0.h(new js7("character_count", String.valueOf(((SurveyData.Step.Question.LongTextQuestionModel) this.questionModel).getCharacterLimit())))));
                return;
            }
            if (questionModel instanceof SurveyData.Step.Question.DatePickerQuestionModel) {
                if (getAnswer() instanceof Answer.DateTimeAnswer) {
                    Answer answer2 = getAnswer();
                    answer2.getClass();
                    setValidationError(z2a.w(((Answer.DateTimeAnswer) answer2).getDateAsString()) ? new ValidationError.ValidationStringError(R.string.intercom_choose_the_date, null, 2, null) : ValidationError.NoValidationError.INSTANCE);
                    return;
                }
                return;
            }
            if (!(questionModel instanceof SurveyData.Step.Question.UploadFileQuestionModel)) {
                setValidationError(ValidationError.NoValidationError.INSTANCE);
                return;
            }
            Answer answer3 = getAnswer();
            Answer.MediaAnswer mediaAnswer = answer3 instanceof Answer.MediaAnswer ? (Answer.MediaAnswer) answer3 : null;
            if (mediaAnswer == null || (mediaItems = mediaAnswer.getMediaItems()) == null) {
                validationStringError = ValidationError.NoValidationError.INSTANCE;
            } else {
                ArrayList arrayList = new ArrayList(ph1.n(mediaItems, 10));
                Iterator<T> it = mediaItems.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Answer.MediaAnswer.MediaItem) it.next()).getUploadStatus());
                }
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                int i = 0;
                while (i < size2) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (obj instanceof Answer.MediaAnswer.FileUploadStatus.Error) {
                        arrayList2.add(obj);
                    }
                }
                Answer.MediaAnswer.FileUploadStatus.Error error = (Answer.MediaAnswer.FileUploadStatus.Error) th1.A(arrayList2);
                if (error != null) {
                    StringProvider.StringRes stringRes = (StringProvider.StringRes) th1.y(error.getError().getErrorMessages());
                    validationStringError = new ValidationError.ValidationStringError(stringRes.getStringRes(), stringRes.getParams());
                } else {
                    validationStringError = ValidationError.NoValidationError.INSTANCE;
                }
            }
            setValidationError(validationStringError);
            return;
        }
        if (!((SurveyData.Step.Question.ShortTextQuestionModel) questionModel).getEnabled()) {
            validationStringError2 = ValidationError.NoValidationError.INSTANCE;
        } else if (((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit() == null || getAnswer().getLength() <= ((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit().intValue()) {
            switch (WhenMappings.$EnumSwitchMapping$0[((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getValidationType().ordinal()]) {
                case 1:
                case 2:
                    str = AttributeType.TEXT;
                    break;
                case 3:
                    str = AttributeType.NUMBER;
                    break;
                case 4:
                    str = "email";
                    break;
                case 5:
                    str = AttributeType.PHONE;
                    break;
                case 6:
                    str = AttributeType.FLOAT;
                    break;
                case 7:
                    str = AttributeType.INTEGER;
                    break;
                default:
                    u.b();
                    return;
            }
            Answer answer4 = getAnswer();
            switch (AttributeValidatorUtils.validateAttribute(answer4 instanceof Answer.SingleAnswer ? ((Answer.SingleAnswer) answer4).getAnswer() : BuildConfig.FLAVOR, str)) {
                case 1:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_string_is_incorrect, null, 2, null);
                    break;
                case 2:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_surveys_email_error, null, 2, null);
                    break;
                case 3:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_number_is_incorrect, null, 2, null);
                    break;
                case 4:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_number_needs_a_prefix, null, 2, null);
                    break;
                case 5:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_number_has_too_many_digits, null, 2, null);
                    break;
                case 6:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_country_code_doesnt_look_quite_right, null, 2, null);
                    break;
                case 7:
                    validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_that_number_is_missing_a_few_digits, null, 2, null);
                    break;
                default:
                    validationStringError2 = ValidationError.NoValidationError.INSTANCE;
                    break;
            }
        } else {
            validationStringError2 = new ValidationError.ValidationStringError(R.string.intercom_surveys_response_too_long, ws0.h(new js7("character_count", String.valueOf(((SurveyData.Step.Question.ShortTextQuestionModel) this.questionModel).getCharacterLimit()))));
        }
        setValidationError(validationStringError2);
    }
}
