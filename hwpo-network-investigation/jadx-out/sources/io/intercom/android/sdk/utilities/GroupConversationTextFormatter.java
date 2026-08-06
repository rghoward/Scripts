package io.intercom.android.sdk.utilities;

import android.content.Context;
import defpackage.bl2;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class GroupConversationTextFormatter {
    public static final int $stable = 0;
    public static final GroupConversationTextFormatter INSTANCE = new GroupConversationTextFormatter();

    private GroupConversationTextFormatter() {
    }

    public static final CharSequence groupConversationSubtitle(String str, int i, Context context) {
        str.getClass();
        context.getClass();
        if (i == 1) {
            CharSequence charSequence = Phrase.from(context, R.string.intercom_name_and_1_other).put("name", str).format();
            charSequence.getClass();
            return charSequence;
        }
        if (i <= 1) {
            return str;
        }
        CharSequence charSequence2 = Phrase.from(context, R.string.intercom_name_and_x_others).put("name", str).put("count", i).format();
        charSequence2.getClass();
        return charSequence2;
    }

    public static final CharSequence groupConversationTitle(String str, int i, Context context) {
        str.getClass();
        context.getClass();
        if (i == 1) {
            StringBuilder sbA = bl2.a(str);
            sbA.append(context.getString(R.string.intercom_group_conversation_1_other_participant_count_short));
            return sbA.toString();
        }
        if (i <= 1) {
            return str;
        }
        StringBuilder sbA2 = bl2.a(str);
        sbA2.append((Object) Phrase.from(context, R.string.intercom_group_conversation_multiple_other_participant_count_short).put("other_participant_count", i).format());
        return sbA2.toString();
    }
}
