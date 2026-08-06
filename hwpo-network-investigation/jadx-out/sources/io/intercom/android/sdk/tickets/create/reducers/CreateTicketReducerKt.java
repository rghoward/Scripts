package io.intercom.android.sdk.tickets.create.reducers;

import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.AttributeType;
import io.intercom.android.sdk.survey.model.SurveyData;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class CreateTicketReducerKt {
    /* JADX WARN: Code duplicated, block: B:100:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x029f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x029d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:? A[LOOP:3: B:74:0x0282->B:133:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x015f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0169  */
    /* JADX WARN: Code duplicated, block: B:48:0x018c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0250  */
    /* JADX WARN: Code duplicated, block: B:76:0x0288  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:89:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:90:0x0317  */
    /* JADX WARN: Code duplicated, block: B:98:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String, qq2] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.Object] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v23 ??, still in use, count: 2, list:
          (r7v23 ??) from 0x00b2: PHI (r7 I:??) = (r7v1 ??), (r7v23 ??) binds: [B:19:0x00b1, B:127:0x00b2] A[DONT_GENERATE, DONT_INLINE]
          (r7v23 ?? I:??[OBJECT, ARRAY]) from 0x009c: CHECK_CAST (io.intercom.android.sdk.survey.QuestionState) (r7v23 ?? I:??[OBJECT, ARRAY])
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState convertToTicketFormUiState(io.intercom.android.sdk.blocks.lib.models.TicketTypeV2 r28, io.intercom.android.sdk.identity.UserIdentity r29, io.intercom.android.sdk.identity.AppConfig r30, io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState r31) {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.tickets.create.reducers.CreateTicketReducerKt.convertToTicketFormUiState(io.intercom.android.sdk.blocks.lib.models.TicketTypeV2, io.intercom.android.sdk.identity.UserIdentity, io.intercom.android.sdk.identity.AppConfig, io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState):io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$CreateTicketFormUiState");
    }

    private static final SurveyData.Step.Question.QuestionValidation.ValidationType getInputType(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 96619420) {
            if (iHashCode != 97526364) {
                if (iHashCode == 1958052158 && str.equals(AttributeType.INTEGER)) {
                    return SurveyData.Step.Question.QuestionValidation.ValidationType.INTEGER;
                }
            } else if (str.equals(AttributeType.FLOAT)) {
                return SurveyData.Step.Question.QuestionValidation.ValidationType.FLOAT;
            }
        } else if (str.equals("email")) {
            return SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL;
        }
        return SurveyData.Step.Question.QuestionValidation.ValidationType.TEXT;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static final int getPlaceholderText(String str) {
        switch (str.hashCode()) {
            case 3322014:
                if (str.equals(AttributeType.LIST)) {
                    return R.string.intercom_please_select;
                }
                break;
            case 96619420:
                if (str.equals("email")) {
                    return R.string.intercom_placeholder_email_input;
                }
                break;
            case 97526364:
                if (str.equals(AttributeType.FLOAT)) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
            case 1958052158:
                if (str.equals(AttributeType.INTEGER)) {
                    return R.string.intercom_placeholder_numerical_inputs;
                }
                break;
        }
        return R.string.intercom_placeholder_text_inputs;
    }
}
