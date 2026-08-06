package io.intercom.android.sdk.survey.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.intercom.twig.BuildConfig;
import defpackage.al;
import defpackage.e44;
import defpackage.fg5;
import defpackage.hf3;
import defpackage.ho2;
import defpackage.nl3;
import defpackage.ol3;
import defpackage.os2;
import defpackage.ph1;
import defpackage.pi1;
import defpackage.qq2;
import defpackage.ru3;
import defpackage.tf5;
import defpackage.u;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class SurveyData {

    @SerializedName("format")
    private final String _format;

    @SerializedName("customization_options")
    private final SurveyCustomization customization;

    @SerializedName("id")
    private final String id;

    @SerializedName("dismissible")
    private final boolean isDismissible;

    @SerializedName("sender")
    private final SurveySenderData sender;

    @SerializedName("show_progress_bar")
    private final boolean showProgressBar;

    @SerializedName("step_count")
    private final int stepCount;

    @SerializedName("steps")
    private final List<Step> steps;

    @SerializedName("survey_progress_id")
    private final String surveyProgressId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final SurveyData NULL = new SurveyData("1", BuildConfig.FLAVOR, hf3.t, "0", new SurveyCustomization(null, null, 3, null), new SurveySenderData(null, null, null, null, 15, null), 0, true, false, 256, null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Step {
        public static final int $stable = 8;

        @SerializedName("step_type")
        private final int _type;

        @SerializedName("actions")
        private final List<SurveyActions> actions;

        @SerializedName("blocks")
        private final List<Block.Builder> blocks;

        @SerializedName("custom_button_text")
        private final String customButtonText;

        @SerializedName("id")
        private final String id;

        @SerializedName("questions")
        private final List<Question> questions;

        public Step(List<Block.Builder> list, String str, List<Question> list2, int i, List<SurveyActions> list3, String str2) {
            list.getClass();
            str.getClass();
            list2.getClass();
            list3.getClass();
            this.blocks = list;
            this.id = str;
            this.questions = list2;
            this._type = i;
            this.actions = list3;
            this.customButtonText = str2;
        }

        private final int component4() {
            return this._type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Step copy$default(Step step, List list, String str, List list2, int i, List list3, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = step.blocks;
            }
            if ((i2 & 2) != 0) {
                str = step.id;
            }
            if ((i2 & 4) != 0) {
                list2 = step.questions;
            }
            if ((i2 & 8) != 0) {
                i = step._type;
            }
            if ((i2 & 16) != 0) {
                list3 = step.actions;
            }
            if ((i2 & 32) != 0) {
                str2 = step.customButtonText;
            }
            List list4 = list3;
            String str3 = str2;
            return step.copy(list, str, list2, i, list4, str3);
        }

        public final List<Block.Builder> component1() {
            return this.blocks;
        }

        public final String component2() {
            return this.id;
        }

        public final List<Question> component3() {
            return this.questions;
        }

        public final List<SurveyActions> component5() {
            return this.actions;
        }

        public final String component6() {
            return this.customButtonText;
        }

        public final Step copy(List<Block.Builder> list, String str, List<Question> list2, int i, List<SurveyActions> list3, String str2) {
            list.getClass();
            str.getClass();
            list2.getClass();
            list3.getClass();
            return new Step(list, str, list2, i, list3, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Step)) {
                return false;
            }
            Step step = (Step) obj;
            return xj5.a(this.blocks, step.blocks) && xj5.a(this.id, step.id) && xj5.a(this.questions, step.questions) && this._type == step._type && xj5.a(this.actions, step.actions) && xj5.a(this.customButtonText, step.customButtonText);
        }

        public final List<SurveyActions> getActions() {
            return this.actions;
        }

        public final List<Block.Builder> getBlocks() {
            return this.blocks;
        }

        public final String getCustomButtonText() {
            return this.customButtonText;
        }

        public final String getId() {
            return this.id;
        }

        public final List<Question> getQuestions() {
            return this.questions;
        }

        public final StepType getType() {
            int i = this._type;
            if (i == 0) {
                return StepType.CONTENT;
            }
            if (i == 1) {
                return StepType.QUESTION;
            }
            if (i != 2) {
                return i != 3 ? StepType.UNSUPPORTED : StepType.THANK_YOU;
            }
            return StepType.INTRO;
        }

        public int hashCode() {
            int iA = ho2.a(os2.a(this._type, ho2.a(ru3.c(this.blocks.hashCode() * 31, 31, this.id), 31, this.questions), 31), 31, this.actions);
            String str = this.customButtonText;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Step(blocks=");
            sb.append(this.blocks);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", questions=");
            sb.append(this.questions);
            sb.append(", _type=");
            sb.append(this._type);
            sb.append(", actions=");
            sb.append(this.actions);
            sb.append(", customButtonText=");
            return wu0.a(sb, this.customButtonText, ')');
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class Question {
            public static final int $stable = 8;

            @SerializedName("blocks")
            private final List<Block.Builder> blocks;

            @SerializedName("id")
            private final String id;

            @SerializedName("data")
            private final QuestionData questionData;

            @SerializedName("question_type")
            private final int questionType;

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class DatePickerQuestionModel extends QuestionModel {
                public static final int $stable = 0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DatePickerQuestionModel(String str, List<Block.Builder> list, boolean z) {
                    super(str, list, null, z, 4, null);
                    str.getClass();
                    list.getClass();
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class MultipleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;
                private final int maxSelection;
                private final int minSelection;
                private final List<String> options;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public MultipleChoiceQuestionModel(String str, List<Block.Builder> list, boolean z, List<String> list2, boolean z2, int i, int i2) {
                    super(str, list, null, z, 4, null);
                    str.getClass();
                    list.getClass();
                    list2.getClass();
                    this.options = list2;
                    this.includeOther = z2;
                    this.minSelection = i;
                    this.maxSelection = i2;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                public final List<String> getOptions() {
                    return this.options;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public enum QuestionType {
                INPUT,
                TEXT,
                DROPDOWN,
                RATING_SCALE,
                MULTI_SELECT;

                private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

                public static nl3<QuestionType> getEntries() {
                    return $ENTRIES;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class QuestionValidation {
                public static final int $stable = 0;

                @SerializedName("type")
                private final int _type;

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public enum ValidationType {
                    TEXT,
                    NUMBER,
                    EMAIL,
                    PHONE,
                    NO_VALIDATION,
                    FLOAT,
                    INTEGER;

                    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

                    public static nl3<ValidationType> getEntries() {
                        return $ENTRIES;
                    }
                }

                public QuestionValidation(int i) {
                    this._type = i;
                }

                private final int component1() {
                    return this._type;
                }

                public static /* synthetic */ QuestionValidation copy$default(QuestionValidation questionValidation, int i, int i2, Object obj) {
                    if ((i2 & 1) != 0) {
                        i = questionValidation._type;
                    }
                    return questionValidation.copy(i);
                }

                public final QuestionValidation copy(int i) {
                    return new QuestionValidation(i);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof QuestionValidation) && this._type == ((QuestionValidation) obj)._type;
                }

                public final ValidationType getValidationType() {
                    int i = this._type;
                    ValidationType validationType = ValidationType.TEXT;
                    if (i == validationType.ordinal()) {
                        return validationType;
                    }
                    ValidationType validationType2 = ValidationType.NUMBER;
                    if (i == validationType2.ordinal()) {
                        return validationType2;
                    }
                    ValidationType validationType3 = ValidationType.EMAIL;
                    if (i == validationType3.ordinal()) {
                        return validationType3;
                    }
                    ValidationType validationType4 = ValidationType.PHONE;
                    if (i == validationType4.ordinal()) {
                        return validationType4;
                    }
                    ValidationType validationType5 = ValidationType.FLOAT;
                    if (i == validationType5.ordinal()) {
                        return validationType5;
                    }
                    ValidationType validationType6 = ValidationType.INTEGER;
                    return i == validationType6.ordinal() ? validationType6 : ValidationType.NO_VALIDATION;
                }

                public int hashCode() {
                    return Integer.hashCode(this._type);
                }

                public String toString() {
                    return e44.a(new StringBuilder("QuestionValidation(_type="), this._type, ')');
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class SingleChoiceQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final boolean includeOther;
                private final List<String> options;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public SingleChoiceQuestionModel(String str, List<Block.Builder> list, boolean z, List<String> list2, boolean z2) {
                    super(str, list, null, z, 4, null);
                    str.getClass();
                    list.getClass();
                    list2.getClass();
                    this.options = list2;
                    this.includeOther = z2;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final List<String> getOptions() {
                    return this.options;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class UnsupportedQuestion extends QuestionModel {
                public static final int $stable = 0;
                public static final UnsupportedQuestion INSTANCE = new UnsupportedQuestion();

                private UnsupportedQuestion() {
                    super(BuildConfig.FLAVOR, hf3.t, null, false, 4, null);
                }
            }

            public Question(List<Block.Builder> list, String str, int i, QuestionData questionData) {
                list.getClass();
                str.getClass();
                questionData.getClass();
                this.blocks = list;
                this.id = str;
                this.questionType = i;
                this.questionData = questionData;
            }

            private final int component3() {
                return this.questionType;
            }

            private final QuestionData component4() {
                return this.questionData;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Question copy$default(Question question, List list, String str, int i, QuestionData questionData, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    list = question.blocks;
                }
                if ((i2 & 2) != 0) {
                    str = question.id;
                }
                if ((i2 & 4) != 0) {
                    i = question.questionType;
                }
                if ((i2 & 8) != 0) {
                    questionData = question.questionData;
                }
                return question.copy(list, str, i, questionData);
            }

            public final List<Block.Builder> component1() {
                return this.blocks;
            }

            public final String component2() {
                return this.id;
            }

            public final Question copy(List<Block.Builder> list, String str, int i, QuestionData questionData) {
                list.getClass();
                str.getClass();
                questionData.getClass();
                return new Question(list, str, i, questionData);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Question)) {
                    return false;
                }
                Question question = (Question) obj;
                return xj5.a(this.blocks, question.blocks) && xj5.a(this.id, question.id) && this.questionType == question.questionType && xj5.a(this.questionData, question.questionData);
            }

            public final List<Block.Builder> getBlocks() {
                return this.blocks;
            }

            public final String getId() {
                return this.id;
            }

            public final QuestionModel getQuestionModel() {
                ArrayList arrayList;
                int i = this.questionType;
                if (i == QuestionType.DROPDOWN.ordinal()) {
                    String str = this.id;
                    List<Block.Builder> list = this.blocks;
                    boolean required = this.questionData.getRequired();
                    String placeholder = this.questionData.getPlaceholder();
                    JsonArray options = this.questionData.getOptions();
                    ArrayList arrayList2 = new ArrayList(ph1.n(options, 10));
                    Iterator<JsonElement> it = options.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(it.next().getAsString());
                    }
                    return new DropDownQuestionModel(str, list, required, arrayList2, placeholder, null, 32, null);
                }
                if (i == QuestionType.INPUT.ordinal()) {
                    return new ShortTextQuestionModel(this.id, this.blocks, this.questionData.getRequired(), this.questionData.getPlaceholder(), this.questionData.getValidation() != null ? this.questionData.getValidation().getValidationType() : QuestionValidation.ValidationType.NO_VALIDATION, this.questionData.getCharacterLimit(), false, null, null, 448, null);
                }
                if (i == QuestionType.TEXT.ordinal()) {
                    return new LongTextQuestionModel(this.id, this.blocks, this.questionData.getRequired(), this.questionData.getPlaceholder(), this.questionData.getValidation() != null ? this.questionData.getValidation().getValidationType() : QuestionValidation.ValidationType.NO_VALIDATION, this.questionData.getCharacterLimit(), 0.0f, 0, null, 448, null);
                }
                if (i != QuestionType.RATING_SCALE.ordinal()) {
                    if (i != QuestionType.MULTI_SELECT.ordinal()) {
                        return UnsupportedQuestion.INSTANCE;
                    }
                    int maxSelection = this.questionData.getMaxSelection();
                    String str2 = this.id;
                    if (maxSelection == 1) {
                        List<Block.Builder> list2 = this.blocks;
                        boolean required2 = this.questionData.getRequired();
                        JsonArray options2 = this.questionData.getOptions();
                        ArrayList arrayList3 = new ArrayList(ph1.n(options2, 10));
                        Iterator<JsonElement> it2 = options2.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(it2.next().getAsString());
                        }
                        return new SingleChoiceQuestionModel(str2, list2, required2, arrayList3, this.questionData.getIncludeOther());
                    }
                    List<Block.Builder> list3 = this.blocks;
                    boolean required3 = this.questionData.getRequired();
                    JsonArray options3 = this.questionData.getOptions();
                    ArrayList arrayList4 = new ArrayList(ph1.n(options3, 10));
                    Iterator<JsonElement> it3 = options3.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(it3.next().getAsString());
                    }
                    return new MultipleChoiceQuestionModel(str2, list3, required3, arrayList4, this.questionData.getIncludeOther(), this.questionData.getMinSelection(), this.questionData.getMaxSelection());
                }
                String str3 = this.id;
                List<Block.Builder> list4 = this.blocks;
                boolean required4 = this.questionData.getRequired();
                String lowerLabel = this.questionData.getLowerLabel();
                String upperLabel = this.questionData.getUpperLabel();
                int scaleStart = this.questionData.getScaleStart();
                int scaleEnd = this.questionData.getScaleEnd();
                if (this.questionData.getQuestionSubtype() == QuestionData.QuestionSubType.EMOJI.ordinal()) {
                    Gson gson = new Gson();
                    JsonArray options4 = this.questionData.getOptions();
                    arrayList = new ArrayList(ph1.n(options4, 10));
                    Iterator<JsonElement> it4 = options4.iterator();
                    while (it4.hasNext()) {
                        arrayList.add((NumericRatingQuestionModel.RatingOption.EmojiRatingOption) gson.fromJson(it4.next(), NumericRatingQuestionModel.RatingOption.EmojiRatingOption.class));
                    }
                } else {
                    fg5 fg5Var = new fg5(this.questionData.getScaleStart(), this.questionData.getScaleEnd(), 1);
                    arrayList = new ArrayList(ph1.n(fg5Var, 10));
                    Iterator<Integer> it5 = fg5Var.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(new NumericRatingQuestionModel.RatingOption.NumericRatingOption(((tf5) it5).nextInt()));
                    }
                }
                ArrayList arrayList5 = arrayList;
                int questionSubtype = this.questionData.getQuestionSubtype();
                QuestionData.QuestionSubType questionSubType = QuestionData.QuestionSubType.NUMERIC;
                if (questionSubtype != questionSubType.ordinal()) {
                    questionSubType = QuestionData.QuestionSubType.STARS;
                    if (questionSubtype != questionSubType.ordinal()) {
                        questionSubType = QuestionData.QuestionSubType.EMOJI;
                        if (questionSubtype != questionSubType.ordinal()) {
                            questionSubType = QuestionData.QuestionSubType.NPS;
                            if (questionSubtype != questionSubType.ordinal()) {
                                questionSubType = QuestionData.QuestionSubType.UNSUPPORTED;
                            }
                        }
                    }
                }
                return new NumericRatingQuestionModel(str3, list4, required4, arrayList5, lowerLabel, upperLabel, scaleStart, scaleEnd, questionSubType);
            }

            public int hashCode() {
                return this.questionData.hashCode() + os2.a(this.questionType, ru3.c(this.blocks.hashCode() * 31, 31, this.id), 31);
            }

            public String toString() {
                return "Question(blocks=" + this.blocks + ", id=" + this.id + ", questionType=" + this.questionType + ", questionData=" + this.questionData + ')';
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class NumericRatingQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final String lowerLabel;
                private final List<RatingOption> options;
                private final QuestionData.QuestionSubType questionSubType;
                private final int scaleEnd;
                private final int scaleStart;
                private final String upperLabel;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public NumericRatingQuestionModel(String str, List<Block.Builder> list, boolean z, List<? extends RatingOption> list2, String str2, String str3, int i, int i2, QuestionData.QuestionSubType questionSubType) {
                    super(str, list, null, z, 4, null);
                    str.getClass();
                    list.getClass();
                    list2.getClass();
                    str2.getClass();
                    str3.getClass();
                    questionSubType.getClass();
                    this.options = list2;
                    this.lowerLabel = str2;
                    this.upperLabel = str3;
                    this.scaleStart = i;
                    this.scaleEnd = i2;
                    this.questionSubType = questionSubType;
                }

                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                public final List<RatingOption> getOptions() {
                    return this.options;
                }

                public final QuestionData.QuestionSubType getQuestionSubType() {
                    return this.questionSubType;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                public final String getUpperLabel() {
                    return this.upperLabel;
                }

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public static abstract class RatingOption {
                    public static final int $stable = 0;

                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class EmojiRatingOption extends RatingOption {
                        public static final int $stable = 0;

                        @SerializedName("image_url")
                        private final String emojiUrl;

                        @SerializedName("unicodeEmoticon")
                        private final String unicode;

                        @SerializedName("value")
                        private final int value;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public EmojiRatingOption(int i, String str, String str2) {
                            super(null);
                            str.getClass();
                            str2.getClass();
                            this.value = i;
                            this.emojiUrl = str;
                            this.unicode = str2;
                        }

                        public final String getEmojiUrl() {
                            return this.emojiUrl;
                        }

                        public final String getUnicode() {
                            return this.unicode;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                    public static final class NumericRatingOption extends RatingOption {
                        public static final int $stable = 0;
                        private final int value;

                        public NumericRatingOption(int i) {
                            super(null);
                            this.value = i;
                        }

                        public final int getValue() {
                            return this.value;
                        }
                    }

                    public /* synthetic */ RatingOption(qq2 qq2Var) {
                        this();
                    }

                    private RatingOption() {
                    }
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static class QuestionModel {
                public static final int $stable = 8;
                private final StringProvider description;
                private final String id;
                private final boolean isRequired;
                private final List<Block.Builder> title;

                public QuestionModel(String str, List<Block.Builder> list, StringProvider stringProvider, boolean z) {
                    str.getClass();
                    list.getClass();
                    stringProvider.getClass();
                    this.id = str;
                    this.title = list;
                    this.description = stringProvider;
                    this.isRequired = z;
                }

                public final StringProvider getDescription() {
                    return this.description;
                }

                public final String getId() {
                    return this.id;
                }

                public final List<Block.Builder> getTitle() {
                    return this.title;
                }

                public final boolean isRequired() {
                    return this.isRequired;
                }

                public /* synthetic */ QuestionModel(String str, List list, StringProvider stringProvider, boolean z, int i, qq2 qq2Var) {
                    this(str, list, (i & 4) != 0 ? new StringProvider.ActualString(BuildConfig.FLAVOR) : stringProvider, z);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class UploadFileQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final int maxSelection;
                private final Set<String> supportedFileType;

                public /* synthetic */ UploadFileQuestionModel(String str, List list, StringProvider stringProvider, boolean z, int i, Set set, int i2, qq2 qq2Var) {
                    this(str, list, (i2 & 4) != 0 ? new StringProvider.ActualString(BuildConfig.FLAVOR) : stringProvider, z, i, set);
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final Set<String> getSupportedFileType() {
                    return this.supportedFileType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UploadFileQuestionModel(String str, List<Block.Builder> list, StringProvider stringProvider, boolean z, int i, Set<String> set) {
                    super(str, list, stringProvider, z);
                    str.getClass();
                    list.getClass();
                    stringProvider.getClass();
                    set.getClass();
                    this.maxSelection = i;
                    this.supportedFileType = set;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class DropDownQuestionModel extends QuestionModel {
                public static final int $stable = 8;
                private final List<String> options;
                private final Integer placeHolderStringRes;
                private final String placeholder;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DropDownQuestionModel(String str, List<Block.Builder> list, boolean z, List<String> list2, String str2, Integer num) {
                    super(str, list, null, z, 4, null);
                    str.getClass();
                    list.getClass();
                    list2.getClass();
                    str2.getClass();
                    this.options = list2;
                    this.placeholder = str2;
                    this.placeHolderStringRes = num;
                }

                public final List<String> getOptions() {
                    return this.options;
                }

                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public /* synthetic */ DropDownQuestionModel(String str, List list, boolean z, List list2, String str2, Integer num, int i, qq2 qq2Var) {
                    this(str, list, z, list2, (i & 16) != 0 ? BuildConfig.FLAVOR : str2, (i & 32) != 0 ? null : num);
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class QuestionData {
                public static final int $stable = 8;

                @SerializedName("placeholder")
                private final String _placeholder;

                @SerializedName("character_limit")
                private final Integer characterLimit;

                @SerializedName("include_other")
                private final boolean includeOther;

                @SerializedName("lower_label")
                private final String lowerLabel;

                @SerializedName("maximum_selection")
                private final int maxSelection;

                @SerializedName("minimum_selection")
                private final int minSelection;

                @SerializedName("options")
                private final JsonArray options;

                @SerializedName("type")
                private final int questionSubtype;

                @SerializedName("required")
                private final boolean required;

                @SerializedName("scale_end")
                private final int scaleEnd;

                @SerializedName("scale_start")
                private final int scaleStart;

                @SerializedName("upper_label")
                private final String upperLabel;

                @SerializedName("validation")
                private final QuestionValidation validation;

                /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
                public enum QuestionSubType {
                    NUMERIC,
                    STARS,
                    EMOJI,
                    NPS,
                    UNSUPPORTED;

                    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

                    public static nl3<QuestionSubType> getEntries() {
                        return $ENTRIES;
                    }
                }

                public /* synthetic */ QuestionData(String str, boolean z, JsonArray jsonArray, String str2, String str3, int i, int i2, boolean z2, int i3, int i4, int i5, QuestionValidation questionValidation, Integer num, int i6, qq2 qq2Var) {
                    this(str, z, (i6 & 4) != 0 ? new JsonArray() : jsonArray, str2, str3, i, i2, z2, i3, i4, i5, questionValidation, num);
                }

                private final String component1() {
                    return this._placeholder;
                }

                public static /* synthetic */ QuestionData copy$default(QuestionData questionData, String str, boolean z, JsonArray jsonArray, String str2, String str3, int i, int i2, boolean z2, int i3, int i4, int i5, QuestionValidation questionValidation, Integer num, int i6, Object obj) {
                    if ((i6 & 1) != 0) {
                        str = questionData._placeholder;
                    }
                    return questionData.copy(str, (i6 & 2) != 0 ? questionData.required : z, (i6 & 4) != 0 ? questionData.options : jsonArray, (i6 & 8) != 0 ? questionData.lowerLabel : str2, (i6 & 16) != 0 ? questionData.upperLabel : str3, (i6 & 32) != 0 ? questionData.scaleStart : i, (i6 & 64) != 0 ? questionData.scaleEnd : i2, (i6 & 128) != 0 ? questionData.includeOther : z2, (i6 & 256) != 0 ? questionData.maxSelection : i3, (i6 & 512) != 0 ? questionData.minSelection : i4, (i6 & 1024) != 0 ? questionData.questionSubtype : i5, (i6 & AudioConstants.AUDIO_FILE_BUFFER_SIZE) != 0 ? questionData.validation : questionValidation, (i6 & 4096) != 0 ? questionData.characterLimit : num);
                }

                public final int component10() {
                    return this.minSelection;
                }

                public final int component11() {
                    return this.questionSubtype;
                }

                public final QuestionValidation component12() {
                    return this.validation;
                }

                public final Integer component13() {
                    return this.characterLimit;
                }

                public final boolean component2() {
                    return this.required;
                }

                public final JsonArray component3() {
                    return this.options;
                }

                public final String component4() {
                    return this.lowerLabel;
                }

                public final String component5() {
                    return this.upperLabel;
                }

                public final int component6() {
                    return this.scaleStart;
                }

                public final int component7() {
                    return this.scaleEnd;
                }

                public final boolean component8() {
                    return this.includeOther;
                }

                public final int component9() {
                    return this.maxSelection;
                }

                public final QuestionData copy(String str, boolean z, JsonArray jsonArray, String str2, String str3, int i, int i2, boolean z2, int i3, int i4, int i5, QuestionValidation questionValidation, Integer num) {
                    jsonArray.getClass();
                    str2.getClass();
                    str3.getClass();
                    return new QuestionData(str, z, jsonArray, str2, str3, i, i2, z2, i3, i4, i5, questionValidation, num);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof QuestionData)) {
                        return false;
                    }
                    QuestionData questionData = (QuestionData) obj;
                    return xj5.a(this._placeholder, questionData._placeholder) && this.required == questionData.required && xj5.a(this.options, questionData.options) && xj5.a(this.lowerLabel, questionData.lowerLabel) && xj5.a(this.upperLabel, questionData.upperLabel) && this.scaleStart == questionData.scaleStart && this.scaleEnd == questionData.scaleEnd && this.includeOther == questionData.includeOther && this.maxSelection == questionData.maxSelection && this.minSelection == questionData.minSelection && this.questionSubtype == questionData.questionSubtype && xj5.a(this.validation, questionData.validation) && xj5.a(this.characterLimit, questionData.characterLimit);
                }

                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getIncludeOther() {
                    return this.includeOther;
                }

                public final String getLowerLabel() {
                    return this.lowerLabel;
                }

                public final int getMaxSelection() {
                    return this.maxSelection;
                }

                public final int getMinSelection() {
                    return this.minSelection;
                }

                public final JsonArray getOptions() {
                    return this.options;
                }

                public final String getPlaceholder() {
                    String str = this._placeholder;
                    return str == null ? BuildConfig.FLAVOR : str;
                }

                public final int getQuestionSubtype() {
                    return this.questionSubtype;
                }

                public final boolean getRequired() {
                    return this.required;
                }

                public final int getScaleEnd() {
                    return this.scaleEnd;
                }

                public final int getScaleStart() {
                    return this.scaleStart;
                }

                public final String getUpperLabel() {
                    return this.upperLabel;
                }

                public final QuestionValidation getValidation() {
                    return this.validation;
                }

                public int hashCode() {
                    String str = this._placeholder;
                    int iA = os2.a(this.questionSubtype, os2.a(this.minSelection, os2.a(this.maxSelection, uo2.a(os2.a(this.scaleEnd, os2.a(this.scaleStart, ru3.c(ru3.c((this.options.hashCode() + uo2.a((str == null ? 0 : str.hashCode()) * 31, this.required, 31)) * 31, 31, this.lowerLabel), 31, this.upperLabel), 31), 31), this.includeOther, 31), 31), 31), 31);
                    QuestionValidation questionValidation = this.validation;
                    int iHashCode = (iA + (questionValidation == null ? 0 : questionValidation.hashCode())) * 31;
                    Integer num = this.characterLimit;
                    return iHashCode + (num != null ? num.hashCode() : 0);
                }

                public String toString() {
                    return "QuestionData(_placeholder=" + this._placeholder + ", required=" + this.required + ", options=" + this.options + ", lowerLabel=" + this.lowerLabel + ", upperLabel=" + this.upperLabel + ", scaleStart=" + this.scaleStart + ", scaleEnd=" + this.scaleEnd + ", includeOther=" + this.includeOther + ", maxSelection=" + this.maxSelection + ", minSelection=" + this.minSelection + ", questionSubtype=" + this.questionSubtype + ", validation=" + this.validation + ", characterLimit=" + this.characterLimit + ')';
                }

                public QuestionData(String str, boolean z, JsonArray jsonArray, String str2, String str3, int i, int i2, boolean z2, int i3, int i4, int i5, QuestionValidation questionValidation, Integer num) {
                    jsonArray.getClass();
                    str2.getClass();
                    str3.getClass();
                    this._placeholder = str;
                    this.required = z;
                    this.options = jsonArray;
                    this.lowerLabel = str2;
                    this.upperLabel = str3;
                    this.scaleStart = i;
                    this.scaleEnd = i2;
                    this.includeOther = z2;
                    this.maxSelection = i3;
                    this.minSelection = i4;
                    this.questionSubtype = i5;
                    this.validation = questionValidation;
                    this.characterLimit = num;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class LongTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;
                private final Integer characterLimit;
                private final int maxLine;
                private final float minHeight;
                private final Integer placeHolderStringRes;
                private final String placeholder;
                private final QuestionValidation.ValidationType validationType;

                public /* synthetic */ LongTextQuestionModel(String str, List list, boolean z, String str2, QuestionValidation.ValidationType validationType, Integer num, float f, int i, Integer num2, int i2, qq2 qq2Var) {
                    this(str, list, z, (i2 & 8) != 0 ? BuildConfig.FLAVOR : str2, validationType, num, (i2 & 64) != 0 ? Float.NaN : f, (i2 & 128) != 0 ? 6 : i, (i2 & 256) != 0 ? null : num2, null);
                }

                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final int getMaxLine() {
                    return this.maxLine;
                }

                /* JADX INFO: renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
                public final float m450getMinHeightD9Ej5fM() {
                    return this.minHeight;
                }

                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                public /* synthetic */ LongTextQuestionModel(String str, List list, boolean z, String str2, QuestionValidation.ValidationType validationType, Integer num, float f, int i, Integer num2, qq2 qq2Var) {
                    this(str, list, z, str2, validationType, num, f, i, num2);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private LongTextQuestionModel(String str, List<Block.Builder> list, boolean z, String str2, QuestionValidation.ValidationType validationType, Integer num, float f, int i, Integer num2) {
                    super(str, list, null, z, 4, null);
                    str.getClass();
                    list.getClass();
                    str2.getClass();
                    validationType.getClass();
                    this.placeholder = str2;
                    this.validationType = validationType;
                    this.characterLimit = num;
                    this.minHeight = f;
                    this.maxLine = i;
                    this.placeHolderStringRes = num2;
                }
            }

            /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
            public static final class ShortTextQuestionModel extends QuestionModel {
                public static final int $stable = 0;
                private final Integer characterLimit;
                private final boolean enabled;
                private final Integer placeHolderStringRes;
                private final String placeholder;
                private final Integer titleStringRes;
                private final QuestionValidation.ValidationType validationType;

                public /* synthetic */ ShortTextQuestionModel(String str, List list, boolean z, String str2, QuestionValidation.ValidationType validationType, Integer num, boolean z2, Integer num2, Integer num3, int i, qq2 qq2Var) {
                    this(str, list, z, (i & 8) != 0 ? BuildConfig.FLAVOR : str2, validationType, num, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : num3);
                }

                public final Integer getCharacterLimit() {
                    return this.characterLimit;
                }

                public final boolean getEnabled() {
                    return this.enabled;
                }

                public final Integer getPlaceHolderStringRes() {
                    return this.placeHolderStringRes;
                }

                public final String getPlaceholder() {
                    return this.placeholder;
                }

                public final Integer getTitleStringRes() {
                    return this.titleStringRes;
                }

                public final QuestionValidation.ValidationType getValidationType() {
                    return this.validationType;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ShortTextQuestionModel(String str, List<Block.Builder> list, boolean z, String str2, QuestionValidation.ValidationType validationType, Integer num, boolean z2, Integer num2, Integer num3) {
                    super(str, list, null, z, 4, null);
                    str.getClass();
                    list.getClass();
                    str2.getClass();
                    validationType.getClass();
                    this.placeholder = str2;
                    this.validationType = validationType;
                    this.characterLimit = num;
                    this.enabled = z2;
                    this.placeHolderStringRes = num2;
                    this.titleStringRes = num3;
                }
            }
        }

        public /* synthetic */ Step(List list, String str, List list2, int i, List list3, String str2, int i2, qq2 qq2Var) {
            this(list, str, list2, i, (i2 & 16) != 0 ? hf3.t : list3, (i2 & 32) != 0 ? null : str2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum StepType {
        CONTENT,
        QUESTION,
        INTRO,
        THANK_YOU,
        UNSUPPORTED;

        private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

        public static nl3<StepType> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public enum SurveyFormat {
        SMALL_FORMAT,
        LARGE_FORMAT;

        private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

        public static nl3<SurveyFormat> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SurveyFormat.values().length];
            try {
                iArr[SurveyFormat.SMALL_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyFormat.LARGE_FORMAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SurveyData(String str, String str2, List<Step> list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        surveyCustomization.getClass();
        this._format = str;
        this.id = str2;
        this.steps = list;
        this.surveyProgressId = str3;
        this.customization = surveyCustomization;
        this.sender = surveySenderData;
        this.stepCount = i;
        this.isDismissible = z;
        this.showProgressBar = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyData copy$default(SurveyData surveyData, String str, String str2, List list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = surveyData._format;
        }
        if ((i2 & 2) != 0) {
            str2 = surveyData.id;
        }
        if ((i2 & 4) != 0) {
            list = surveyData.steps;
        }
        if ((i2 & 8) != 0) {
            str3 = surveyData.surveyProgressId;
        }
        if ((i2 & 16) != 0) {
            surveyCustomization = surveyData.customization;
        }
        if ((i2 & 32) != 0) {
            surveySenderData = surveyData.sender;
        }
        if ((i2 & 64) != 0) {
            i = surveyData.stepCount;
        }
        if ((i2 & 128) != 0) {
            z = surveyData.isDismissible;
        }
        if ((i2 & 256) != 0) {
            z2 = surveyData.showProgressBar;
        }
        boolean z3 = z;
        boolean z4 = z2;
        SurveySenderData surveySenderData2 = surveySenderData;
        int i3 = i;
        SurveyCustomization surveyCustomization2 = surveyCustomization;
        List list2 = list;
        return surveyData.copy(str, str2, list2, str3, surveyCustomization2, surveySenderData2, i3, z3, z4);
    }

    public final String component1() {
        return this._format;
    }

    public final String component2() {
        return this.id;
    }

    public final List<Step> component3() {
        return this.steps;
    }

    public final String component4() {
        return this.surveyProgressId;
    }

    public final SurveyCustomization component5() {
        return this.customization;
    }

    public final SurveySenderData component6() {
        return this.sender;
    }

    public final int component7() {
        return this.stepCount;
    }

    public final boolean component8() {
        return this.isDismissible;
    }

    public final boolean component9() {
        return this.showProgressBar;
    }

    public final SurveyData copy(String str, String str2, List<Step> list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        surveyCustomization.getClass();
        return new SurveyData(str, str2, list, str3, surveyCustomization, surveySenderData, i, z, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurveyData)) {
            return false;
        }
        SurveyData surveyData = (SurveyData) obj;
        return xj5.a(this._format, surveyData._format) && xj5.a(this.id, surveyData.id) && xj5.a(this.steps, surveyData.steps) && xj5.a(this.surveyProgressId, surveyData.surveyProgressId) && xj5.a(this.customization, surveyData.customization) && xj5.a(this.sender, surveyData.sender) && this.stepCount == surveyData.stepCount && this.isDismissible == surveyData.isDismissible && this.showProgressBar == surveyData.showProgressBar;
    }

    public final SurveyCustomization getCustomization() {
        return this.customization;
    }

    public final SurveyFormat getFormat() {
        return Integer.parseInt(this._format) == 0 ? SurveyFormat.SMALL_FORMAT : SurveyFormat.LARGE_FORMAT;
    }

    public final String getFormatMetric() {
        int i = WhenMappings.$EnumSwitchMapping$0[getFormat().ordinal()];
        if (i == 1) {
            return "small_full_screen";
        }
        if (i == 2) {
            return "large_full_screen";
        }
        u.b();
        return null;
    }

    public final String getId() {
        return this.id;
    }

    public final SurveySenderData getSender() {
        return this.sender;
    }

    public final boolean getShowProgressBar() {
        return this.showProgressBar;
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    public final List<Step> getSteps() {
        return this.steps;
    }

    public final String getSurveyProgressId() {
        return this.surveyProgressId;
    }

    public final String get_format() {
        return this._format;
    }

    public int hashCode() {
        int iHashCode = (this.customization.hashCode() + ru3.c(ho2.a(ru3.c(this._format.hashCode() * 31, 31, this.id), 31, this.steps), 31, this.surveyProgressId)) * 31;
        SurveySenderData surveySenderData = this.sender;
        return Boolean.hashCode(this.showProgressBar) + uo2.a(os2.a(this.stepCount, (iHashCode + (surveySenderData == null ? 0 : surveySenderData.hashCode())) * 31, 31), this.isDismissible, 31);
    }

    public final boolean isDismissible() {
        return this.isDismissible;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SurveyData(_format=");
        sb.append(this._format);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", steps=");
        sb.append(this.steps);
        sb.append(", surveyProgressId=");
        sb.append(this.surveyProgressId);
        sb.append(", customization=");
        sb.append(this.customization);
        sb.append(", sender=");
        sb.append(this.sender);
        sb.append(", stepCount=");
        sb.append(this.stepCount);
        sb.append(", isDismissible=");
        sb.append(this.isDismissible);
        sb.append(", showProgressBar=");
        return pi1.a(sb, this.showProgressBar, ')');
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class Companion {
        public /* synthetic */ Companion(qq2 qq2Var) {
            this();
        }

        public final SurveyData getNULL() {
            return SurveyData.NULL;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class SurveyActions {
        public static final int $stable = 0;

        @SerializedName("action_title")
        private final String actionTitle;

        @SerializedName("android_uri")
        private final String androidUri;

        @SerializedName("id")
        private final long id;

        @SerializedName("web_url")
        private final String webUrl;

        public SurveyActions(String str, long j, String str2, String str3) {
            str.getClass();
            this.actionTitle = str;
            this.id = j;
            this.webUrl = str2;
            this.androidUri = str3;
        }

        public static /* synthetic */ SurveyActions copy$default(SurveyActions surveyActions, String str, long j, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surveyActions.actionTitle;
            }
            if ((i & 2) != 0) {
                j = surveyActions.id;
            }
            if ((i & 4) != 0) {
                str2 = surveyActions.webUrl;
            }
            if ((i & 8) != 0) {
                str3 = surveyActions.androidUri;
            }
            return surveyActions.copy(str, j, str2, str3);
        }

        public final String component1() {
            return this.actionTitle;
        }

        public final long component2() {
            return this.id;
        }

        public final String component3() {
            return this.webUrl;
        }

        public final String component4() {
            return this.androidUri;
        }

        public final SurveyActions copy(String str, long j, String str2, String str3) {
            str.getClass();
            return new SurveyActions(str, j, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SurveyActions)) {
                return false;
            }
            SurveyActions surveyActions = (SurveyActions) obj;
            return xj5.a(this.actionTitle, surveyActions.actionTitle) && this.id == surveyActions.id && xj5.a(this.webUrl, surveyActions.webUrl) && xj5.a(this.androidUri, surveyActions.androidUri);
        }

        public final String getActionTitle() {
            return this.actionTitle;
        }

        public final String getAndroidUri() {
            return this.androidUri;
        }

        public final long getId() {
            return this.id;
        }

        public final String getWebUrl() {
            return this.webUrl;
        }

        public int hashCode() {
            int iC = al.c(this.id, this.actionTitle.hashCode() * 31, 31);
            String str = this.webUrl;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.androidUri;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SurveyActions(actionTitle=");
            sb.append(this.actionTitle);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", webUrl=");
            sb.append(this.webUrl);
            sb.append(", androidUri=");
            return wu0.a(sb, this.androidUri, ')');
        }

        public /* synthetic */ SurveyActions(String str, long j, String str2, String str3, int i, qq2 qq2Var) {
            this(str, j, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    public /* synthetic */ SurveyData(String str, String str2, List list, String str3, SurveyCustomization surveyCustomization, SurveySenderData surveySenderData, int i, boolean z, boolean z2, int i2, qq2 qq2Var) {
        this(str, str2, list, str3, surveyCustomization, surveySenderData, i, z, (i2 & 256) != 0 ? true : z2);
    }
}
