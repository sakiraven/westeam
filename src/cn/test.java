package cn;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.sun.org.apache.bcel.internal.generic.LSTORE;

import cn.dao.FriendsDao;
import cn.dao.impl.CommentDaoImpl;
import cn.dao.impl.CommodityInformationDaoImpl;
import cn.dao.impl.FriendsDaoImpl;
import cn.dao.impl.MessageDaoImpl;
import cn.entity.Account;
import cn.entity.Comment;
import cn.entity.CommodityInformation;
import cn.entity.Message;
import cn.entity.UserInformation;
import cn.service.client.ClientAccountService;
import cn.service.client.ClientCommentService;
import cn.service.client.ClientDetailedPictureService;
import cn.service.client.ClientMessageService;
import cn.service.client.ClientPlayLabelService;
import cn.service.client.ClientUserGamesService;
import cn.service.client.impl.ClientAccountServiceImpl;
import cn.service.client.impl.ClientCommentServiceImpl;
import cn.service.client.impl.ClientCommodityInformationServiceImpl;
import cn.service.client.impl.ClientDetailedPictureServiceImpl;
import cn.service.client.impl.ClientFriendServiceImpl;
import cn.service.client.impl.ClientLanguageLabelServiceImpl;
import cn.service.client.impl.ClientMessageServiceImpl;
import cn.service.client.impl.ClientNoticeServiceImpl;
import cn.service.client.impl.ClientPlayLabelServiceImpl;
import cn.service.client.impl.ClientUserGamesServiceImpl;
import cn.service.client.impl.ClientUserInformationServiceImpl;
import cn.service.client.impl.ClientTypeLabelServiceImpl;
import cn.service.manager.MgrAccountService;
import cn.service.manager.MgrCommentService;
import cn.service.manager.MgrCommodityInformationService;
import cn.service.manager.MgrLanguageLabelService;
import cn.service.manager.MgrPlayLabelService;
import cn.service.manager.MgrTypeLabelService;
import cn.service.manager.impl.MgrAccountServiceImpl;
import cn.service.manager.impl.MgrCommentServiceImpl;
import cn.service.manager.impl.MgrCommodityInformationServiceImpl;
import cn.service.manager.impl.MgrLanguageLabelServiceImpl;
import cn.service.manager.impl.MgrPlayLabelServiceImpl;
import cn.service.manager.impl.MgrTypeLabelServiceImpl;

public class test {
	public static void main(String[] args) {
		ClientUserGamesService cugs = new ClientUserGamesServiceImpl();
		int [] ciid={4,5,6,7};
		System.out.println(cugs.ClientInsert(3, ciid, 400));
		  //System.out.println(Str1);
	/*	ClientCommentService ccs = new ClientCommentServiceImpl();
		List<Integer>getlt =  ccs.ClientQueryCount(4, 2019);
		for (Integer integer : getlt) {
			System.out.println(integer);
		}*/
	/*	List<Comment> lt=new ArrayList<Comment>();
		Comment ct =new Comment();
		ct.setBad(123);
		Comment ct1 =new Comment();
		ct1.setBad(321);
		lt.add(ct);
		lt.add(ct1);
		System.out.println(lt.get(0).getBad());*/
		
//		ct.setBad(1);
		//System.out.println(ct.getBad());
		/*ClientUserInformationServiceImpl cuis = new ClientUserInformationServiceImpl();
		System.out.println(cuis.ClientFriendQuery("asd"));*/
		/*ClientMessageService cms = new ClientMessageServiceImpl();
		System.out.println(cms.ClientQueryStatus(24, 20).get(0).getDelStatus());
*/		//MgrCommentService mcs = new MgrCommentServiceImpl();
		/*MgrCommodityInformationService mcs = new MgrCommodityInformationServiceImpl();
		
		System.out.println(mcs.MgrQueryComment().size());*/
		//CommodityInformationDaoImpl cidi = new CommodityInformationDaoImpl();
		/*ClientAccountService cas=new ClientAccountServiceImpl();
		System.out.println(cas.ClientYanZheng("ere"));*/
		/*Account at= cas.ClientDengLu("123", "123");
		System.out.println(at.getAdmin());*/
//		// AccountDao ad = new AccountDaoImpl();
//		// µÇÂ¼ok
//		// System.out.println(ad.AdDengLu("clownmz", "axjl93111"));
//		// ×¢²á
//		// Account at = new Account();
//		// at.setName("axjl");
//		// at.setPassword("123");
//		// System.out.println(ad.AdZhuCe(at));
//		// ÐÞ¸Ä
//		/*
//		 * Account at = new Account(); at.setName("axjl");
//		 * at.setPassword("1234"); at.setAid(5);
//		 * System.out.println(ad.AdUpData(at));
//		 */
//		// É¾³ý
//		// System.out.println(ad.AdDelete(4));
//		// User_InformationDaoImpl uidi = new User_InformationDaoImpl();
//		/*
//		 * User_Information ui = new User_Information(); ui.setAid(3);
//		 * ui.setNickname("clownmz"); ui.setPicture("picture");
//		 * System.out.println(uidi.InsertInfo(ui));
//		 */
//		// System.out.println(uidi.UidQuery(1, 2).size());
//		/*
//		 * AddressDaoImpl adi = new AddressDaoImpl(); Address as = new
//		 * Address(); as.setAddress("ºÚÁú½­Ê¡¹þ¶û±õÊÐ"); as.setUser_info_id(3);
//		 * as.setAddress_mark(1); as.setTimestamp("2018-3-4");
//		 * System.out.println(adi.AdUpData(as));
//		 * System.out.println(adi.AdInsert(as));
//		 */
//
//		// Commodity_InformationDaoImpl coid = new
//		// Commodity_InformationDaoImpl();
//		/*
//		 * User_GamesDaoImpl ugd = new User_GamesDaoImpl();
//		 * 
//		 * System.out.println();
//		 */
//
//		// CommentDaoImpl cdi = new CommentDaoImpl();
//		// System.out.println(cdi.CdQuery().size());
//		// Comment ct = new Comment();
//		/*
//		 * ct.setCiid(3); ct.setNeirong("asd"); ct.setType(1);
//		 * ct.setUser_info_id(3); System.out.println(cdi.CdInsert(ct));
//		 */
//		// System.out.println(cdi.CdQuery(3).size());
//		/*
//		 * Detailed_PictureDaoImpl dpd = new Detailed_PictureDaoImpl();
//		 * System.out.println(dpd.DpdDelete("picture2"));
//		 */
//		// int id []={4,5};
//		// String language[] ={"µÂÓï","Òâ´óÀûÓï"};
//		// Language_LabelDaoImpl lld = new Language_LabelDaoImpl();
//		// // System.out.println(lld.LldUpDate(id, language));
//		// //lld.LldInsert("ÈÕÓï");
//		// Language_Label_IndexDaoImpl llid = new Language_Label_IndexDaoImpl();
//		// System.out.println(llid.LlidDelete(3,3));
//		// Play_LabelDaoImpl
//
//		// int id []={8,9};
//		// String language[] ={"SteamÔÆÓï","°üº¬¹Ø¿¨±à¼­Æ÷Óï"};
//		// Play_LabelDaoImpl pld = new Play_LabelDaoImpl();
//		// Type_LabelDaoImpl tld = new Type_LabelDaoImpl();
//		// // tld.TldDelete(7);
//		// // pld.PldUpDate(id, language);
//		// //System.out.println(ad.AdQuery("clownmz"));
//		// User_GamesDaoImpl ugdi = new User_GamesDaoImpl();
//		// PathDaoImpl pdi = new PathDaoImpl();
//		// System.out.println(pdi.PicturePath());
//		//ClientAccountService cas = new ClientAccountServiceImpl();
//		ClientCommentService ccs = new ClientCommentServiceImpl();
//		MgrAccountService mas = new MgrAccountServiceImpl();
//		UserInformation ui = new UserInformation();
//		//Account at = new Account();
//		Comment ct = new Comment();
//		FriendsDao fd = new FriendsDaoImpl();
//		MessageDaoImpl mdi = new MessageDaoImpl();
//		Message me = new Message();
//		MgrCommentService mcs = new MgrCommentServiceImpl();
//		MgrCommodityInformationService mcis = new MgrCommodityInformationServiceImpl();
//		ClientCommodityInformationServiceImpl ccisi = new ClientCommodityInformationServiceImpl();
//		ClientFriendServiceImpl cfsi = new ClientFriendServiceImpl();
//		ClientLanguageLabelServiceImpl clls = new ClientLanguageLabelServiceImpl();
//		MgrLanguageLabelServiceImpl mgr = new MgrLanguageLabelServiceImpl();
//		ClientMessageServiceImpl cmsi = new ClientMessageServiceImpl();
//		ClientNoticeServiceImpl cnsi = new ClientNoticeServiceImpl();
//		MgrPlayLabelService mpls = new MgrPlayLabelServiceImpl();
//		ClietnTypeLabelServiceImpl ctls = new ClietnTypeLabelServiceImpl();
//		ClientPlayLabelService cpls = new ClientPlayLabelServiceImpl();
//		ClientUserGamesService cugs = new ClientUserGamesServiceImpl();
//		ClientUserInformationServiceImpl cuisi = new ClientUserInformationServiceImpl();
//		ClientDetailedPictureService cdps = new ClientDetailedPictureServiceImpl();
//		CommodityInformation ci = new CommodityInformation();
//		MgrLanguageLabelService mlls = new MgrLanguageLabelServiceImpl();
//		MgrTypeLabelService mtls = new MgrTypeLabelServiceImpl();
////		int type_Id[]={1};
//		String type[]={"asd","q","x"};
//		me.setMessage("asd");
//		me.setSend_User_Id(17);
//		me.setSendto_User_Id(15);
		//System.out.println(cmsi.ClientInser(me));
//		ct.setNeiRong("ads");
//		ct.setCiid(7);
//		cdps.ClientQuery(7);
//		ct.setType(1);
//		ct.setUser_Info_Id(12);
//		at.setName("12312321");
//		at.setPassword("asdasdas");
//		ui.setNickName("zxczxczxczxc");
//		System.out.println(cas.ClientUpdate(at));
		//System.out.println(mtls.mgr);
		// ci.setCiid(5);
		// ci.setFaxing("asdads");
		// ci.setGuanyu("saddas");
		// ci.setKaifa("asdasd");
		// ci.setMoney(123);
		// ci.setName("asdasd");
		// ci.setPlay_jianjie("asdasdasd");
		// System.out.println(mcis.MgrDelete(5));
		// System.out.println(mcs.MgrDelete(16, 16, "dfdfdf"));
		// System.out.println(mas.MgrDelete(8));
		// System.out.println(ctls.ClientQuery(3));
		// ui.setAid(7);
		// ui.setNickName("asd");
		// ui.setPicture("asdasdasasd");
		// System.out.println(cuisi.ClientUpDate(ui));
		// System.out.println(cuisi.ClientQuery(4));
		// System.out.println(cugs.ClientQuery(17).size());
		// System.out.println(cugs.ClientDelete(17, 3));
		// ui.setBlance(55);
		// System.out.println(cugs.ClientInsert(17, 3, 44));
		// System.out.println(cpls.ClientQuery(4w));
		// System.out.println(cnsi.ClientDelete(20));

		// me.setMessage("das");
		// me.setSend_User_Id(15);
		// me.setSendto_user_id(8);
		// System.out.println(cmsi.ClientInser(me));
		// System.out.println(cmsi.ClientQuery(15, 8));
		// System.out.println(cmsi.ClientDelete(8, 15));

		// System.out.println(cfsi.ClientDelete(8,9));
		// ct.setCiid(4);
		// ct.setType(1);
		// ct.setUser_Info_Id(16);
		// ct.setNeiRong("asdas");
		// System.out.println(ccs.ClientInsert(ct));

		// System.out.println(cfsi.ClientInsert(18, 18, "name"));
		// int type_Id[]={1,5};
		// int key = 1;
		// String name ="3";
		// System.out.println(cugs.ClientDelete(8, 3));
		// System.out.println(ctls.ClientQuery().size());
		// System.out.println(ctls.ClientQuery(5).size());
		// System.out.println(mpls.MgrInsert("zxc"));
		// int play_Id[]={2,5};
		// String play[]={"s","d"};
		// System.out.println(mpls.MgrUpDate(play_Id, play));

		// System.out.println(cnsi.ClientDelete(19));
		// cmsi.ClientQuery(15, 8);
		// System.out.println(cmsi.ClientQuery(8, 15).size());
		/*
		 * int Language_Id[]={2}; String language[]={"7ÎÄ"};
		 * System.out.println(mgr.MgrUpDate(Language_Id, language));
		 */
		// System.out.println(mllsi.LldInsert("ÖÐÎÄ"));
		// mcs.MgrDelete(3, 16, "sdsfa");
		// System.out.println(mas.MgrQuery().size());
		/*
		 * at.setAid(14); //at.setName("123"); at.setPassword("as");
		 * ui.setNickname("fqfr13"); ui.setAid(14); ui.setPicture("sad");
		 * System.out.println(cas.ClientUpdate(at, ui));
		 */
		// mdi.MdMgrDelete(8);
		// mdi.MdUpDate(8, 15);
		// System.out.println(mdi.MdQuery(8, 15).get(0).getSend_User_Id());
		// System.out.println(fd.FdInsert(8, 9));
		// System.out.println(mas.MgrDelete(5));
		// System.out.println(fd.FdDelete(3, 6));
		// ct.setCiid(3);
		// ct.setNeirong("sdalfjl");
		// ct.setType(1);
		// ct.setUser_info_id(6);
		// System.out.println(ccs.ClientInsert(ct));
		// System.out.println( ccs.ClientQuery(5).size());
		// System.out.println(mas.MgrQuery().size());
		// mas.ManagerDelete(9);
		/*
		 * ui.setNickname("lzh"); ui.setPicture("picture"); ui.setAid(10);
		 * at.setPassword("lzh19990311"); at.setAid(10);
		 * System.out.println(cas.ClientUpdate(at, ui));
		 */
		// ui.setNickname("jhy");
		// ui.setPicture("Í¼Æ¬2");
		//
		// at.setName("zxc1");
		// at.setPassword("asd");
		// System.out.println(cas.ClientDengLu("axjl","1234"));

	}
}
