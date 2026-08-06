package io.intercom.android.sdk.utilities.extensions;

import com.intercom.twig.BuildConfig;
import defpackage.th1;
import defpackage.xj5;
import defpackage.z2a;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.MessageStyle;
import io.intercom.android.sdk.models.Metadata;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class PartExtensionsKt {
    public static final boolean hasNextConcatPartNewStyle(List<? extends Part> list, int i) {
        list.getClass();
        return i >= 0 && i < list.size() - 1 && shouldConcatenate(list.get(i), list.get(i + 1));
    }

    public static final boolean hasPreviousConcatPartNewStyle(List<? extends Part> list, int i) {
        list.getClass();
        return 1 <= i && i <= list.size() - 1 && shouldConcatenate(list.get(i + (-1)), list.get(i));
    }

    public static final boolean isAttributeCollector(Part part) {
        part.getClass();
        return part.getMessageStyle() == MessageStyle.ATTRIBUTE_COLLECTOR && !part.getForm().getAttributes().isEmpty();
    }

    public static final boolean isLinkCard(Part part) {
        part.getClass();
        return isSingleBlockPartOfType(part, BlockType.LINK) && MessageStyle.CHAT == part.getMessageStyle();
    }

    public static final boolean isQuickReplyOnly(Part part) {
        part.getClass();
        List<ReplyOption> replyOptions = part.getReplyOptions();
        replyOptions.getClass();
        return !replyOptions.isEmpty() && part.getBlocks().isEmpty();
    }

    private static final boolean isSingleBlockPartOfType(Part part, BlockType blockType) {
        return part.getBlocks().size() == 1 && part.getBlocks().get(0).getType() == blockType;
    }

    public static final boolean isTypingPart(Part part) {
        part.getClass();
        return part.getMessageStyle() == MessageStyle.ADMIN_IS_TYPING_STYLE;
    }

    public static final boolean nextPartFromSameParticipant(Part part, Part part2) {
        part.getClass();
        part2.getClass();
        return xj5.a(part.getParticipantId(), part2.getParticipantId());
    }

    public static final Avatar resolvedAvatar(Part part) {
        List<Avatar> avatars;
        Avatar avatar;
        part.getClass();
        Metadata metadata = part.getMetadata();
        if (metadata != null && (avatars = metadata.getAvatars()) != null && (avatar = (Avatar) th1.A(avatars)) != null) {
            return avatar;
        }
        Avatar avatar2 = part.getParticipant().getAvatar();
        avatar2.getClass();
        return avatar2;
    }

    public static final AvatarWrapper resolvedAvatarWrapper(Part part) {
        List<Avatar> avatars;
        part.getClass();
        Metadata metadata = part.getMetadata();
        Avatar avatar = (metadata == null || (avatars = metadata.getAvatars()) == null) ? null : (Avatar) th1.A(avatars);
        if (avatar != null) {
            return new AvatarWrapper(avatar, false, 2, null);
        }
        Avatar avatar2 = part.getParticipant().getAvatar();
        avatar2.getClass();
        Boolean boolIsBot = part.getParticipant().isBot();
        boolIsBot.getClass();
        return new AvatarWrapper(avatar2, boolIsBot.booleanValue());
    }

    public static final String resolvedDisplayName(Part part) {
        part.getClass();
        Metadata metadata = part.getMetadata();
        if (metadata != null) {
            if (z2a.w(metadata.getTitle())) {
                metadata = null;
            }
            if (metadata != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(metadata.getTitle());
                String suffix = metadata.getSuffix();
                if (suffix != null) {
                    sb.append(" • ".concat(suffix));
                }
                return sb.toString();
            }
        }
        String forename = part.getParticipant().getForename();
        forename.getClass();
        return forename;
    }

    public static final String resolvedDisplaySuffix(Part part) {
        String suffix;
        part.getClass();
        Metadata metadata = part.getMetadata();
        if (metadata == null) {
            return BuildConfig.FLAVOR;
        }
        if (z2a.w(metadata.getTitle())) {
            metadata = null;
        }
        return (metadata == null || (suffix = metadata.getSuffix()) == null) ? BuildConfig.FLAVOR : suffix;
    }

    public static final String resolvedDisplayTitle(Part part) {
        String title;
        part.getClass();
        Metadata metadata = part.getMetadata();
        if (metadata != null) {
            if (z2a.w(metadata.getTitle())) {
                metadata = null;
            }
            if (metadata != null && (title = metadata.getTitle()) != null) {
                return title;
            }
        }
        String forename = part.getParticipant().getForename();
        forename.getClass();
        return forename;
    }

    private static final boolean shouldConcatenate(Part part, Part part2) {
        if (!nextPartFromSameParticipant(part, part2) || Math.abs(part2.getCreatedAt() - part.getCreatedAt()) >= 180 || isTypingPart(part) || isTypingPart(part2) || isLinkCard(part) || isLinkCard(part2) || part.isEvent().booleanValue() || part2.isEvent().booleanValue() || isAttributeCollector(part) || isAttributeCollector(part2) || isQuickReplyOnly(part) || isQuickReplyOnly(part2)) {
            return false;
        }
        MessageStyle messageStyle = part.getMessageStyle();
        MessageStyle messageStyle2 = MessageStyle.POST;
        if (messageStyle == messageStyle2 || part2.getMessageStyle() == messageStyle2) {
            return false;
        }
        MessageStyle messageStyle3 = part.getMessageStyle();
        MessageStyle messageStyle4 = MessageStyle.NOTE;
        return (messageStyle3 == messageStyle4 || part2.getMessageStyle() == messageStyle4) ? false : true;
    }
}
