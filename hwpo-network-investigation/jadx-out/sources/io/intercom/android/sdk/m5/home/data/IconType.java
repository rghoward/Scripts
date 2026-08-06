package io.intercom.android.sdk.m5.home.data;

import defpackage.nl3;
import defpackage.ol3;
import defpackage.qq2;
import io.intercom.android.sdk.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public enum IconType {
    TEAMMATE { // from class: io.intercom.android.sdk.m5.home.data.IconType.TEAMMATE
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_send_message_icon);
        }
    },
    BOT { // from class: io.intercom.android.sdk.m5.home.data.IconType.BOT
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_conversation_card_question);
        }
    },
    FIN { // from class: io.intercom.android.sdk.m5.home.data.IconType.FIN
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_chevron);
        }
    },
    FACE_PILE { // from class: io.intercom.android.sdk.m5.home.data.IconType.FACE_PILE
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return null;
        }
    };

    private static final /* synthetic */ nl3 $ENTRIES = ol3.b(values());

    /* synthetic */ IconType(qq2 qq2Var) {
        this();
    }

    public static nl3<IconType> getEntries() {
        return $ENTRIES;
    }

    public abstract Integer getIcon();
}
