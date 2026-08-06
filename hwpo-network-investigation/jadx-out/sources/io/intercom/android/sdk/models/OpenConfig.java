package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.ho2;
import defpackage.qq2;
import defpackage.ws0;
import defpackage.xj5;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class OpenConfig {
    public static final int $stable = 8;

    @SerializedName("form")
    private final OpenForm form;

    @SerializedName("open_to")
    private final OpenToSpace openTo;

    @SerializedName("spaces")
    private final List<Space> spaces;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ OpenConfig(OpenToSpace openToSpace, List list, OpenForm openForm, int i, qq2 qq2Var) {
        this((i & 1) != 0 ? OpenToSpace.HOME : openToSpace, (i & 2) != 0 ? ws0.h(new Space(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0)) : list, (i & 4) != 0 ? OpenForm.DEFAULT : openForm);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenConfig copy$default(OpenConfig openConfig, OpenToSpace openToSpace, List list, OpenForm openForm, int i, Object obj) {
        if ((i & 1) != 0) {
            openToSpace = openConfig.openTo;
        }
        if ((i & 2) != 0) {
            list = openConfig.spaces;
        }
        if ((i & 4) != 0) {
            openForm = openConfig.form;
        }
        return openConfig.copy(openToSpace, list, openForm);
    }

    public final OpenToSpace component1() {
        return this.openTo;
    }

    public final List<Space> component2() {
        return this.spaces;
    }

    public final OpenForm component3() {
        return this.form;
    }

    public final OpenConfig copy(OpenToSpace openToSpace, List<Space> list, OpenForm openForm) {
        openToSpace.getClass();
        list.getClass();
        openForm.getClass();
        return new OpenConfig(openToSpace, list, openForm);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenConfig)) {
            return false;
        }
        OpenConfig openConfig = (OpenConfig) obj;
        return this.openTo == openConfig.openTo && xj5.a(this.spaces, openConfig.spaces) && this.form == openConfig.form;
    }

    public final OpenForm getForm() {
        return this.form;
    }

    public final OpenToSpace getOpenTo() {
        return this.openTo;
    }

    public final List<Space> getSpaces() {
        return this.spaces;
    }

    public int hashCode() {
        return this.form.hashCode() + ho2.a(this.openTo.hashCode() * 31, 31, this.spaces);
    }

    public String toString() {
        return "OpenConfig(openTo=" + this.openTo + ", spaces=" + this.spaces + ", form=" + this.form + ')';
    }

    public OpenConfig(OpenToSpace openToSpace, List<Space> list, OpenForm openForm) {
        openToSpace.getClass();
        list.getClass();
        openForm.getClass();
        this.openTo = openToSpace;
        this.spaces = list;
        this.form = openForm;
    }

    public OpenConfig() {
        this(null, null, null, 7, null);
    }
}
