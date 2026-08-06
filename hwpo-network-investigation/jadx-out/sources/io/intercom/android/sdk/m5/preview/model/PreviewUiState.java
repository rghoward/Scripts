package io.intercom.android.sdk.m5.preview.model;

import defpackage.hf3;
import defpackage.os2;
import defpackage.qq2;
import defpackage.uo2;
import defpackage.wu0;
import defpackage.xj5;
import io.intercom.android.sdk.m5.preview.data.IntercomPreviewFile;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewUiState {
    public static final int $stable = 8;
    private final String confirmationText;
    private final int currentPage;
    private final String fileSavedText;
    private final String fileSavingText;
    private final List<IntercomPreviewFile> files;
    private final String saveFailedText;
    private final boolean showDeleteAction;
    private final boolean showDownloadAction;
    private final boolean showSendAction;

    public /* synthetic */ PreviewUiState(List list, int i, boolean z, boolean z2, String str, boolean z3, String str2, String str3, String str4, int i2, qq2 qq2Var) {
        this((i2 & 1) != 0 ? hf3.t : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : str3, (i2 & 256) != 0 ? null : str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreviewUiState copy$default(PreviewUiState previewUiState, List list, int i, boolean z, boolean z2, String str, boolean z3, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = previewUiState.files;
        }
        if ((i2 & 2) != 0) {
            i = previewUiState.currentPage;
        }
        if ((i2 & 4) != 0) {
            z = previewUiState.showDeleteAction;
        }
        if ((i2 & 8) != 0) {
            z2 = previewUiState.showSendAction;
        }
        if ((i2 & 16) != 0) {
            str = previewUiState.confirmationText;
        }
        if ((i2 & 32) != 0) {
            z3 = previewUiState.showDownloadAction;
        }
        if ((i2 & 64) != 0) {
            str2 = previewUiState.fileSavingText;
        }
        if ((i2 & 128) != 0) {
            str3 = previewUiState.fileSavedText;
        }
        if ((i2 & 256) != 0) {
            str4 = previewUiState.saveFailedText;
        }
        String str5 = str3;
        String str6 = str4;
        boolean z4 = z3;
        String str7 = str2;
        String str8 = str;
        boolean z5 = z;
        return previewUiState.copy(list, i, z5, z2, str8, z4, str7, str5, str6);
    }

    public final List<IntercomPreviewFile> component1() {
        return this.files;
    }

    public final int component2() {
        return this.currentPage;
    }

    public final boolean component3() {
        return this.showDeleteAction;
    }

    public final boolean component4() {
        return this.showSendAction;
    }

    public final String component5() {
        return this.confirmationText;
    }

    public final boolean component6() {
        return this.showDownloadAction;
    }

    public final String component7() {
        return this.fileSavingText;
    }

    public final String component8() {
        return this.fileSavedText;
    }

    public final String component9() {
        return this.saveFailedText;
    }

    public final PreviewUiState copy(List<? extends IntercomPreviewFile> list, int i, boolean z, boolean z2, String str, boolean z3, String str2, String str3, String str4) {
        list.getClass();
        return new PreviewUiState(list, i, z, z2, str, z3, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewUiState)) {
            return false;
        }
        PreviewUiState previewUiState = (PreviewUiState) obj;
        return xj5.a(this.files, previewUiState.files) && this.currentPage == previewUiState.currentPage && this.showDeleteAction == previewUiState.showDeleteAction && this.showSendAction == previewUiState.showSendAction && xj5.a(this.confirmationText, previewUiState.confirmationText) && this.showDownloadAction == previewUiState.showDownloadAction && xj5.a(this.fileSavingText, previewUiState.fileSavingText) && xj5.a(this.fileSavedText, previewUiState.fileSavedText) && xj5.a(this.saveFailedText, previewUiState.saveFailedText);
    }

    public final String getConfirmationText() {
        return this.confirmationText;
    }

    public final int getCurrentPage() {
        return this.currentPage;
    }

    public final String getFileSavedText() {
        return this.fileSavedText;
    }

    public final String getFileSavingText() {
        return this.fileSavingText;
    }

    public final List<IntercomPreviewFile> getFiles() {
        return this.files;
    }

    public final String getSaveFailedText() {
        return this.saveFailedText;
    }

    public final boolean getShowDeleteAction() {
        return this.showDeleteAction;
    }

    public final boolean getShowDownloadAction() {
        return this.showDownloadAction;
    }

    public final boolean getShowSendAction() {
        return this.showSendAction;
    }

    public int hashCode() {
        int iA = uo2.a(uo2.a(os2.a(this.currentPage, this.files.hashCode() * 31, 31), this.showDeleteAction, 31), this.showSendAction, 31);
        String str = this.confirmationText;
        int iA2 = uo2.a((iA + (str == null ? 0 : str.hashCode())) * 31, this.showDownloadAction, 31);
        String str2 = this.fileSavingText;
        int iHashCode = (iA2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fileSavedText;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.saveFailedText;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PreviewUiState(files=");
        sb.append(this.files);
        sb.append(", currentPage=");
        sb.append(this.currentPage);
        sb.append(", showDeleteAction=");
        sb.append(this.showDeleteAction);
        sb.append(", showSendAction=");
        sb.append(this.showSendAction);
        sb.append(", confirmationText=");
        sb.append(this.confirmationText);
        sb.append(", showDownloadAction=");
        sb.append(this.showDownloadAction);
        sb.append(", fileSavingText=");
        sb.append(this.fileSavingText);
        sb.append(", fileSavedText=");
        sb.append(this.fileSavedText);
        sb.append(", saveFailedText=");
        return wu0.a(sb, this.saveFailedText, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewUiState(List<? extends IntercomPreviewFile> list, int i, boolean z, boolean z2, String str, boolean z3, String str2, String str3, String str4) {
        list.getClass();
        this.files = list;
        this.currentPage = i;
        this.showDeleteAction = z;
        this.showSendAction = z2;
        this.confirmationText = str;
        this.showDownloadAction = z3;
        this.fileSavingText = str2;
        this.fileSavedText = str3;
        this.saveFailedText = str4;
    }

    public PreviewUiState() {
        this(null, 0, false, false, null, false, null, null, null, 511, null);
    }
}
