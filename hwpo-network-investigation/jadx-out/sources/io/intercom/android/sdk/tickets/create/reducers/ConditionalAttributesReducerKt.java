package io.intercom.android.sdk.tickets.create.reducers;

import defpackage.e96;
import defpackage.hf3;
import defpackage.u;
import defpackage.ws0;
import defpackage.xj5;
import io.intercom.android.sdk.blocks.lib.models.FormField;
import io.intercom.android.sdk.blocks.lib.models.ListOption;
import io.intercom.android.sdk.blocks.lib.models.Options;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ConditionalAttributesReducerKt {
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    public static final List<TicketAttributeRequest> reduceAttributeList(String str, TicketTypeV2 ticketTypeV2, CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState) {
        Object next;
        Answer answer;
        QuestionState questionState;
        String answer2;
        List<ListOption> listOptions;
        Object next2;
        Object next3;
        str.getClass();
        createTicketFormUiState.getClass();
        if (ticketTypeV2 != null) {
            Iterator<T> it = ticketTypeV2.getFormFields().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!xj5.a(((FormField) next).getId(), str));
            FormField formField = (FormField) next;
            if (formField != null && formField.isControllingAttribute()) {
                e96 e96VarF = ws0.f();
                for (FormField formField2 : ticketTypeV2.getFormFields()) {
                    String id = formField2.getId();
                    if (createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content) {
                        Iterator<T> it2 = ((CreateTicketViewModel.CreateTicketFormUiState.Content) createTicketFormUiState).getQuestions().iterator();
                        do {
                            if (!it2.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it2.next();
                        } while (!xj5.a(((QuestionState) next3).getQuestionModel().getId(), id));
                        questionState = (QuestionState) next3;
                        answer = questionState != null ? questionState.getAnswer() : null;
                    } else {
                        answer = null;
                        questionState = null;
                    }
                    if (answer != null) {
                        if ((answer instanceof Answer.DateTimeAnswer) || (answer instanceof Answer.MediaAnswer) || (answer instanceof Answer.MultipleAnswer) || answer.equals(Answer.NoAnswer.InitialNoAnswer.INSTANCE) || answer.equals(Answer.NoAnswer.ResetNoAnswer.INSTANCE)) {
                            answer2 = null;
                        } else {
                            if (!(answer instanceof Answer.SingleAnswer)) {
                                u.b();
                                return null;
                            }
                            if ((questionState != null ? questionState.getQuestionModel() : null) instanceof SurveyData.Step.Question.DropDownQuestionModel) {
                                Options options = formField2.getOptions();
                                if (options == null || (listOptions = options.getListOptions()) == null) {
                                    answer2 = null;
                                } else {
                                    Iterator<T> it3 = listOptions.iterator();
                                    do {
                                        if (!it3.hasNext()) {
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it3.next();
                                    } while (!xj5.a(((ListOption) next2).getLabel(), ((Answer.SingleAnswer) answer).getAnswer()));
                                    ListOption listOption = (ListOption) next2;
                                    if (listOption != null) {
                                        answer2 = listOption.getId();
                                    } else {
                                        answer2 = null;
                                    }
                                }
                            } else {
                                answer2 = ((Answer.SingleAnswer) answer).getAnswer();
                            }
                        }
                        if (answer2 != null) {
                            e96VarF.add(new TicketAttributeRequest(id, answer2));
                        }
                    }
                }
                return ws0.e(e96VarF);
            }
        }
        return hf3.t;
    }
}
