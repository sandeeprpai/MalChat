Malayalam-Transliteration
=========================
case 'a': if(s1.charAt(i+1)=='a')
                            {
                              msg += '\u0D06';//aa
                              i++;
                            }
                            else if(s1.charAt(i + 1) == 'e')
                            {
                             msg+='\u0D0F';//ae
                             i++;
                            }
                            else if(s1.charAt(i + 1) == 'i')
                            {
                              msg+='\u0D10';//ai
                              i++;
                            }
                            else if (s1.charAt(i + 1) == 'u')
                            {
                              msg+='\u0D14';//au
                              i++;
                            }
                            else
                            {
                             msg+='\u0D05';//a
                            }
                            break;

                  case 'e': if(s1.charAt(i + 1) == 'e')
                            {
                              msg+='\u0D08';//ee
                              i++;
                            }
                           else if(s1.charAt(i + 1) == 'a')
                            {
                              msg+='\u0D0f';//ea
                              i++;
                            }
                            else
                            {
                              msg+='\u0D0E';//e
                            }
                            break;
                  case 'i': if(s1.charAt(i + 1) == 'i')
                            {
                              msg+='\u0D08';//ii
                              i++;
                            }
                            msg+='\u0D07';
                            temp='a';break;//i
                  case 'o': if(s1.charAt(i + 1) == 'o')
                            {
                              msg+='\u0D0A';//oo
                              i++;
                            }
                            else if(s1.charAt(i + 1) == 'a')
                            {
                              msg+='\u0D13';//oa
                              i++;
                            }
                            else
                            {
                             msg+='\u0D12';//o
                            }
                            break;
                  case 'u': {msg+='\u0D09'; break;}//u
              }
            }
          else
          {
           String r="";
           switch(ch)
           {
               case 'k': if(s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D16";//kh
                              i++;
                            }
                          else
                            {
                              r="\u0D15";//k
                            }
                            break;
               case 'g':if(s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D18";//gh
                              i++;
                            }
                          else
                            {
                             r="\u0D17";//g
                            }
                            break;
               case 'c':if(s1.charAt(i + 1) == 'h')
                            {
                              if(s1.charAt(i + 2) == 'h')
                              {
                                  r="\u0D1B";//chh
                                  i+=2;
                              }
                                else
                                { r = "\u0D1a";//ch
                              i++;}
                            }

                          else
                            {
                             r="\u0D15";//c
                            }
                          break;
               case 'j': if(s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D1D";//jh
                              i++;
                            }
                          else
                            {
                             r="\u0D1C";//j
                            }
                          break;
               case 'n': if(s1.charAt(i + 1) == 'g')
                            {
                              r="\u0D19";//ng
                              i++;
                            }
                          else if(s1.charAt(i + 1) == 'j')
                            {
                             r="\u0D1E";//nj
                             i++;
                            }
                       else if(s1.charAt(i + 1) == 'J')
                           {
                             r="\u0D1E\u0D4D\u0D1E";
                             i++;
                           }
                      else if(s1.charAt(i + 1) == 'G')
                           {
                             r="\u0D19\u0D4D\u0D19";
                             i++;
                           }
                      else if(s1.charAt(i + 1) == 'k')
                           {
                             r="\u0d19\u0d4d\u0d15";
                             i++;
                           }
                          else if(s1.charAt(i + 1) == '_' || s1.charAt(i + 1) == ' ')
                            {
                             r="\u0D6F";//n_
                              if(s1.charAt(i + 1) == '_')
                              {
                                  i++;
                              }
                              flag=1;
                            }
                          else
                            {
                             r="\u0D28";//n
                            }
                          break;
               case 'T': if(s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D20";//Th
                              i++;
                            }
                          else
                            {
                             r="\u0D1F";//T
                            }
                          break;
                 case 'D': if(s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D22";//Th
                              i++;
                            }
                          else
                            {
                             r="\u0D21";//T
                            }
                          break;
                 case 't':if(s1.charAt(i + 1) == 'h')
                            {
                              if(s1.charAt(i + 2) == 'h')
                              {
                                  r="\u0D25";//thh
                                  i+=2;
                              }
                                else
                                { r = "\u0D24";//th
                              i++;}
                            }
                           else if(s1.charAt(i + 1) == 't')
                           {r="ട്ട";
                           }
                           else
                            {
                             r="\u0d31\u0d4d\u0d31";
                           }
                         /* else
                            {
                             r="\u0D1F\u0D4D\u0D1F";//t not found

                            }*/
                          break;
                 case 'd': if(s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D27";//dh
                              i++;
                            }
                          else
                            {
                             r="\u0D26";//d
                            }
                          break;
               case 'N': if(s1.charAt(i + 1) == '_'||s1.charAt(i + 1) == ' ')
                            {
                             r="\u0D7A";//N_
                              if(s1.charAt(i + 1) == '_')
                              {
                                  i++;
                              }
                              flag=1;
                            }

                          else
                            {
                             r="\u0D23";//N
                            }
                          break;
                 case 'p': if(s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D2B";//ph
                              i++;
                            }
                          else
                            {
                             r="\u0D2A";//p
                            }
                          break;
                 case 'b': if(s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D2D";//bh
                              i++;
                            }
                          else
                            {
                             r="\u0D2C";//b
                            }
                          break;
                 case 'm': if(s1.charAt(i + 1) == '_'||s1.charAt(i + 1) == ' ')
                            {
                             r="\u0D02";//l_
                              if(s1.charAt(i + 1) == '_')
                              {
                                  i++;
                              }
                              flag=1;
                            }

                           else
                            {
                              r="\u0D2E";//l
                            }
                          break;
               case 'y':  r="\u0D2F"; break; //y
               case 'r': if(s1.charAt(i + 1) == '_'||s1.charAt(i + 1) == ' ')
                            {
                              r="\u0D6A";//r_
                              if(s1.charAt(i + 1) == '_')
                              {
                                  i++;
                              }
                              flag=1;
                            }
                         else if(s1.charAt(i + 1) == 'r'&&s1.charAt(i + 2) == 'e')
                             {
                              r="\u0D60";
                              i+=2;
                              flag=1;
                             }

                          else
                            {
                             r="\u0D30";//r
                            }
                          break;
               case 'l':   if(s1.charAt(i + 1) == '_'||s1.charAt(i + 1) == ' ')
                            {
                             r="\u0D7D";//l_
                              if(s1.charAt(i + 1) == '_')
                              {
                                  i++;
                              }
                              flag=1;
                            }

                           else
                            {
                              r="\u0D32";//l
                            }

                          break;
               case 'L': if(s1.charAt(i + 1) == '_'||s1.charAt(i + 1) == ' ')
                            {
                             r="\u0D7E";//L_
                              if(s1.charAt(i + 1) == '_')
                              {
                                  i++;
                              }
                              flag=1;
                            }

                           else
                            {
                              r="\u0D33";//L
                            }

                          break;
               case 'v': r="\u0D35"; break;//v
               case 's': if(s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D37";//sh
                              i++;
                            }
                          else
                            {
                             r="\u0D38";//s
                            }
                          break;

               case 'S': r="\u0D36";break;//S
               case 'h': r="\u0D39";break;//h
               case 'R': r="\u0D31";break;//R
               case 'z': if (s1.charAt(i + 1) == 'h')
                            {
                              r="\u0D34";//zh
                              i++;
                            }break;
               case 'H': r = "\u0D03";flag=1;break;//H
               case 'f': r= "\u0D2B";flag=1;break;//f

               default: {temp=ch;
                         msg+=ch;
                        flag=2;
                       }
           }
            if(flag!=2)
            {
             i++;
            ch=s1.charAt(i);
            switch(ch)
              {


                case 'a':
                    if (s1.charAt(i + 1) == 'a')
                         {
                          msg=msg+r+'\u0D3E';
                          i++;
                         }
                         else if(s1.charAt(i + 1) == 'e')
                         {
                          msg=msg+r+'\u0D47';
                          i++;
                         }
                         else if(s1.charAt(i + 1) == 'i')
                         {
                          msg=msg+r+'\u0D48';
                          i++;
                         }
                         else if(s1.charAt(i + 1) == 'u')
                         {
                          msg=msg+r+'\u0D57';
                          i++;
                        }
                         else
                        {
                          msg=msg+r;
                         }  break;
              case 'e': if(s1.charAt(i + 1) == 'e')
                            {
                              msg+=r+'\u0D40';//ee

                              i++;
                            }
                       else if(s1.charAt(i + 1) == 'a')
                            {
                              msg+=r+'\u0D47';//ea
                              i++;
                            }
                            else
                            {
                              msg+=r+'\u0D46';//e
                            }break;
                  case 'i': msg+=r+'\u0D3F';break;//i
                  case 'o': if(s1.charAt(i + 1) == 'o')
                            {
                              msg+=r+'\u0D42';//oo
                              i++;
                            }
                            else if(s1.charAt(i + 1) == 'a')
                            {
                              msg+=r+'\u0D4B';//oa
                              i++;
                            }
                            else if(s1.charAt(i + 1) == 'u')
                            {
                              msg+=r+'\u0D57';//oa
                              i++;
                            }
                            else
                            {
                             msg+=r+'\u0D4A';//o
                            } break;
                  case 'u': msg+=r+'\u0D41'; break;//u