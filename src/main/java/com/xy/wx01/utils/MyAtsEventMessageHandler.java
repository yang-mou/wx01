package com.xy.wx01.utils;

import org.springframework.stereotype.Component;
import org.weixin4j.model.message.OutputMessage;
import org.weixin4j.model.message.event.ClickEventMessage;
import org.weixin4j.model.message.event.LocationEventMessage;
import org.weixin4j.model.message.event.LocationSelectEventMessage;
import org.weixin4j.model.message.event.PicPhotoOrAlbumEventMessage;
import org.weixin4j.model.message.event.PicSysPhotoEventMessage;
import org.weixin4j.model.message.event.PicWeixinEventMessage;
import org.weixin4j.model.message.event.QrsceneScanEventMessage;
import org.weixin4j.model.message.event.QrsceneSubscribeEventMessage;
import org.weixin4j.model.message.event.ScanCodePushEventMessage;
import org.weixin4j.model.message.event.ScanCodeWaitMsgEventMessage;
import org.weixin4j.model.message.event.SubscribeEventMessage;
import org.weixin4j.model.message.event.UnSubscribeEventMessage;
import org.weixin4j.model.message.event.ViewEventMessage;
import org.weixin4j.model.message.output.ImageOutputMessage;
import org.weixin4j.model.message.output.TextOutputMessage;
import org.weixin4j.spi.IEventMessageHandler;

/**
 * 自定义事件消息处理器
 *
 * @author yangqisheng
 */
@Component
public class MyAtsEventMessageHandler implements IEventMessageHandler {

    @Override
    public OutputMessage subscribe(SubscribeEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("感谢您的关注！");
        return out;
    }

    @Override
    public OutputMessage unSubscribe(UnSubscribeEventMessage msg) {
        //取消关注
        return null;
    }

    @Override
    public OutputMessage qrsceneSubscribe(QrsceneSubscribeEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("感谢您的关注！，来源：" + msg.getEventKey());
        return out;
    }

    @Override
    public OutputMessage qrsceneScan(QrsceneScanEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("你的消息已经收到！A");
        return out;
    }

    @Override
    public OutputMessage location(LocationEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("你的消息已经收到！B");
        return out;
    }

    @Override
    public OutputMessage click(ClickEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("点击了菜单！C");
        return out;
    }

    @Override
    public OutputMessage view(ViewEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("点击了链接！D");
        return out;
    }

    @Override
    public OutputMessage scanCodePush(ScanCodePushEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("扫码！E");
        return out;
    }

    @Override
    public OutputMessage scanCodeWaitMsg(ScanCodeWaitMsgEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("扫码等待中！F");
        return out;
    }

    @Override
    public OutputMessage picSysPhoto(PicSysPhotoEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("发起拍照！G");
        return out;
    }

    @Override
    public OutputMessage picPhotoOrAlbum(PicPhotoOrAlbumEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("选择相册！H");
        return out;
    }

    @Override
    public OutputMessage picWeixin(PicWeixinEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("上次图片！I");
        return out;
    }

    @Override
    public OutputMessage locationSelect(LocationSelectEventMessage msg) {
        TextOutputMessage out = new TextOutputMessage();
        out.setContent("选择地理位置！J");
        return out;
    }

}
