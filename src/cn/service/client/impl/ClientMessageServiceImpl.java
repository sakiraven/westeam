package cn.service.client.impl;

import java.util.List;

import cn.dao.MessageDao;
import cn.dao.impl.MessageDaoImpl;
import cn.entity.Message;
import cn.service.client.ClientMessageService;

public class ClientMessageServiceImpl implements ClientMessageService {

	public List<Message> ClientQuery(int sendToId, int sendId) {
		MessageDao md = new MessageDaoImpl();
		md.MdUpDate(sendToId, sendId);
		return md.MdQuery(sendToId, sendId);
	}

	public int ClientInser(Message me) {
		MessageDao md = new MessageDaoImpl();
		return md.MdInser(me);
	}

	public int ClientDelete(int sendToId, int sendId) {
		MessageDao md = new MessageDaoImpl();
		List<Message> getlt = md.MdQuery(sendToId, sendId);
		int result = 0;
		if (getlt.size() > 0) {
			for (Message message : getlt) {
				int keySend = message.getDelStatus() + sendId;
				if (keySend == sendId+sendToId)
					result = md.MdDelete(sendToId, sendId);
				break;
			}
			md.MdUpDateDel(sendToId, sendId);
//			if (keySend == sendId)
//				md.MdUpDateDel(sendToId, sendId);
//			else
//				result = md.MdDelete(sendToId, sendId);
		}
		return result;
	}

	public List<Message> ClientQueryStatus(int sendToId, int sendId) {
		MessageDao md = new MessageDaoImpl();
		return md.MdQuery(sendToId, sendId);
	}

}
